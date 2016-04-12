/*
 * Copyright (C) 2014 DroidUX.com
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.droidux.demos.layouts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import com.droidux.core.components.utils.CompatUtil;
import com.droidux.ui.widgets.layout.CurtainFoldLayout;
import com.droidux.ui.widgets.layout.CurtainFoldLayout.OnFoldChangedListener;
import com.droidux.ui.widgets.layout.CurtainFoldLayout.Orientation;

public class CurtainFoldLayoutTest extends BaseTestActivity {

    private final int FOLD_ANIMATION_DURATION = 1000;

    private CurtainFoldLayout mFoldLayout;
    private SeekBar mAnchorSeekBar;
    private Orientation mOrientation = Orientation.HORIZONTAL;

    private int mNumberOfFolds = 2;

    private float mAnchorFactor = 0;

    private boolean mDidLoadSpinner = true;

    private boolean mIsSepiaOn = true;

    private ItemSelectedListener mItemSelectedListener;

    private ImageView mImageView;

    private Paint mSepiaPaint;
    private Paint mDefaultPaint;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_curtainfoldlayouttest;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mImageView = (ImageView)findViewById(R.id.image_view);
        mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        mImageView.setImageDrawable(getResources().getDrawable(R.drawable.profilepic));

        mAnchorSeekBar = (SeekBar)findViewById(R.id.anchor_seek_bar);
        mFoldLayout = (CurtainFoldLayout)findViewById(R.id.fold_view);
        mFoldLayout.setBackgroundColor(Color.BLACK);
        mFoldLayout.setFoldListener(mOnFoldListener);

        mOrientation= mFoldLayout.getOrientation();

        mAnchorSeekBar.setOnSeekBarChangeListener(mSeekBarChangeListener);

        mItemSelectedListener = new ItemSelectedListener();

        mDefaultPaint = new Paint();
        mSepiaPaint = new Paint();

        ColorMatrix m1 = new ColorMatrix();
        ColorMatrix m2 = new ColorMatrix();
        m1.setSaturation(0);
        m2.setScale(1f, .95f, .82f, 1.0f);
        m1.setConcat(m2, m1);
        mSepiaPaint.setColorFilter(new ColorMatrixColorFilter(m1));
    }

    private OnFoldChangedListener mOnFoldListener =
            new OnFoldChangedListener() {
                @Override
                public void onFoldChanged(float newFoldFactor, float oldFoldFactor) {
                    if (newFoldFactor > 0 && oldFoldFactor == 0) {
                        if (mIsSepiaOn) {
                            setSepiaLayer(mFoldLayout.getChildAt(0), true);
                        }
                    } else if (newFoldFactor == 0 && oldFoldFactor > 0) {
                        setSepiaLayer(mFoldLayout.getChildAt(0), false);
                    }
                }
            };

    @TargetApi(VERSION_CODES.JELLY_BEAN_MR1)
    private void setSepiaLayer (View view, boolean isSepiaLayerOn) {
        if (CompatUtil.hasApiLevel(VERSION_CODES.JELLY_BEAN_MR1)) {
            if (isSepiaLayerOn) {
                view.setLayerType(View.LAYER_TYPE_HARDWARE, null);
                view.setLayerPaint(mSepiaPaint);
            } else {
                view.setLayerPaint(mDefaultPaint);
            }
        }
    }

    private SeekBar.OnSeekBarChangeListener mSeekBarChangeListener = new SeekBar
            .OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            mAnchorFactor = ((float)mAnchorSeekBar.getProgress())/100.0f;
            mFoldLayout.setAnchorFactor(mAnchorFactor);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fold, menu);
        Spinner s = (Spinner) MenuItemCompat.getActionView(menu.findItem(R.id.num_of_folds));
        s.setOnItemSelectedListener(mItemSelectedListener);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch(item.getItemId()) {
            case R.id.animate_fold:
                animateFold();
                break;
            case R.id.toggle_orientation:
                mOrientation = (mOrientation == Orientation.HORIZONTAL) ? Orientation.VERTICAL :
                        Orientation.HORIZONTAL;
                item.setTitle((mOrientation == Orientation.HORIZONTAL) ? R.string.vertical :
                R.string.horizontal);
                mFoldLayout.setFoldFactor(0);
                mFoldLayout.setOrientation(mOrientation);
                break;
            case R.id.sepia:
                mIsSepiaOn = !mIsSepiaOn;
                item.setChecked(!mIsSepiaOn);
                if (mIsSepiaOn && mFoldLayout.getFoldFactor() != 0) {
                    setSepiaLayer(mFoldLayout, true);
                } else {
                    setSepiaLayer(mFoldLayout, false);
                }
                break;
            default:
               break;

        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Animates the folding view inwards (to a completely folded state) from its
     * current state and then back out to its original state.
     */
    @TargetApi(VERSION_CODES.HONEYCOMB)
    public void animateFold () {
        if (CompatUtil.hasHoneycomb()) {
            float foldFactor = mFoldLayout.getFoldFactor();

            ObjectAnimator animator = ObjectAnimator.ofFloat(mFoldLayout, "foldFactor", foldFactor, 1);
            animator.setRepeatMode(ValueAnimator.REVERSE);
            animator.setRepeatCount(1);
            animator.setDuration(FOLD_ANIMATION_DURATION);
            animator.setInterpolator(new AccelerateInterpolator());
            animator.start();
        }
    }

    /**
     * Listens for selection events of the spinner located on the action bar. Every
     * time a new value is selected, the number of folds in the folding view is updated
     * and is also restored to a default unfolded state.
     */
    private class ItemSelectedListener implements OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            mNumberOfFolds = Integer.parseInt(parent.getItemAtPosition(pos).toString());
            if (mDidLoadSpinner) {
                mDidLoadSpinner = false;
            } else {
                mFoldLayout.setFoldFactor(0);
                mFoldLayout.setNumberOfSegments(mNumberOfFolds);
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
}