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

import android.app.Application;
import com.droidux.core.components.DroidUxLibrary;

/**
 *
 */
public class LayoutsSampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        DroidUxLibrary.register("enter-your-api-key-here", this);
    }
}
