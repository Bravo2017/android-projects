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

package com.droidux.demos.layouts.anim;

import android.view.animation.TranslateAnimation;


public class BounceAnimation extends TranslateAnimation {
	public BounceAnimation(float height) {
		this(height, ABSOLUTE);
	}
	public BounceAnimation(float height, int dimensionType) {
		super(ABSOLUTE, 0,ABSOLUTE, 0, ABSOLUTE,0, dimensionType, -height);
		setInterpolator(new BounceInterpolator());
	}

}
