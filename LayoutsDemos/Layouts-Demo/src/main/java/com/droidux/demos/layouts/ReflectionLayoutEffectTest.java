/*
 * Copyright (C) 2011-2014 Ximpl
 * All Rights Reserved. This program and the accompanying materials
 * are owned by Ximpl or its suppliers.  The program is protected by
 * international copyright laws and treaty provisions.
 * Any violation will be prosecuted under applicable laws.
 * NOTICE: The following is Source Code and is subject to all
 * restrictions on such code as contained in the End User License Agreement
 * accompanying this product.
 */
package com.droidux.demos.layouts;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

import com.droidux.demos.layouts.anim.BounceAnimation;


/**
 *
 */
public class ReflectionLayoutEffectTest extends BaseTestActivity {
    private static final String LOG_TAG = ReflectionLayoutEffectTest.class.getSimpleName();
    private static final boolean localLOGV = true;
    private Animation mBounceAnim;
    private View mContent;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_reflectionlayouttest;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (localLOGV) {
            Log.v(LOG_TAG, "onCreate()");
        }
        super.onCreate(savedInstanceState);

        // effect
        Paint effectPaint = new Paint();
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0f);
        ColorMatrixColorFilter cf = new ColorMatrixColorFilter(matrix);
        effectPaint.setColorFilter(cf);



        // animation
        Animation bounce = new BounceAnimation(0.4f, Animation.RELATIVE_TO_SELF);
        bounce.setDuration(3*getResources().getInteger(android.R.integer.config_mediumAnimTime));
        mBounceAnim = bounce;
        mContent = findViewById(R.id.content);
    }

    public void onContentClicked(View target) {
        mContent.clearAnimation();
        mContent.startAnimation(mBounceAnim);
    }

}