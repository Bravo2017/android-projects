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

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.widget.ImageView;

/**
 *
 */
public class MaskedDrawableTest extends BaseTestActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView iv = (ImageView) findViewById(R.id.image1);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_maskeddrawabletest;
    }
}