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
package com.droidux.demos.layouts.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

import com.droidux.demos.layouts.DroidUXDemos;


public class ActivityHelper {
	public static String getActivityTitle(final Activity context) {
		return getActivityTitle(context, getActivityLabel(context));
	}
	public static String getActivityTitle(final Activity context, final String path) {
        String[] labels = path.split("/");
        String title = labels[labels.length-1];
        if (TextUtils.isEmpty(title)) {
            title = getActivityLabel(context);
        }
        return title;
	}

    public static boolean goHome(final Activity context) {
        Intent intent = new Intent(context, DroidUXDemos.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
        context.finish();
        return true;
    }

    private static String getActivityLabel(Activity context) {
		if(context == null ) {
			return null;
		}
		String label = null;
		try {
			PackageManager pm = context.getPackageManager();
			ActivityInfo info = context.getPackageManager().getActivityInfo(context.getComponentName(), 0);
            int labelRes = info.labelRes;
            if (labelRes != 0) {
                label = context.getResources().getString(labelRes);
            } else {
                CharSequence labelSeq = info.loadLabel(pm);
                label = labelSeq != null
                    ? labelSeq.toString()
                    : info.name;
            }
		} catch (NameNotFoundException e) {
		}
		return label;
	}
}
