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

import android.view.animation.Interpolator;

class BounceInterpolator implements Interpolator {
	private static final double TIME_SPLIT_POINT = 1/2.75;
	public BounceInterpolator() {}

	public float getInterpolation(float t) {
		return (1-calcInterpolation(t));
	}

	private float calcInterpolation(float t) {
		if (t < TIME_SPLIT_POINT) {
			return 7.5625f*(t-=(0.5*TIME_SPLIT_POINT))*t * 4;
		} else
		if (t < 2*TIME_SPLIT_POINT) {
			return 7.5625f*(t-=(1.5*TIME_SPLIT_POINT))*t + .75f;
		} else
		if (t < 2.5*TIME_SPLIT_POINT) {
			return 7.5625f*(t-=(2.25*TIME_SPLIT_POINT))*t + .9375f;
		} else {
			return 7.5625f*(t-=(2.625*TIME_SPLIT_POINT))*t + .984375f;
		}

	}

}
