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

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;

import com.droidux.demos.layouts.anim.BounceAnimation;

/**
 *
 */
public class ReflectionLayoutTest extends BaseTestActivity {
    private Animation mBounceAnim;
    private View mContent;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_reflectionlayouttest;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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