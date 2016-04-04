package com.dismas.imaya.bits;

import android.os.Environment;

/**
 * Created by imaya on 4/4/16.
 */
public class Constants {
    public static String TAG = "";
    public static final String IMAGE_DIRECTORY = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
    public static final String SOUND_DIRECTORY = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath();

}
