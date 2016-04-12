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


public class CurtainFoldLayoutTest extends BaseTestActivity {

    private final int FOLD_ANIMATION_DURATION = 1000;


    private SeekBar mAnchorSeekBar;


    private int mNumberOfFolds = 2;

    private float mAnchorFactor = 0;

    private boolean mDidLoadSpinner = true;

    private boolean mIsSepiaOn = true;

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

        mAnchorSeekBar.setOnSeekBarChangeListener(mSeekBarChangeListener);



        mDefaultPaint = new Paint();
        mSepiaPaint = new Paint();

        ColorMatrix m1 = new ColorMatrix();
        ColorMatrix m2 = new ColorMatrix();
        m1.setSaturation(0);
        m2.setScale(1f, .95f, .82f, 1.0f);
        m1.setConcat(m2, m1);
        mSepiaPaint.setColorFilter(new ColorMatrixColorFilter(m1));
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
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fold, menu);
        Spinner s = (Spinner) MenuItemCompat.getActionView(menu.findItem(R.id.num_of_folds));
        return true;
    }


}