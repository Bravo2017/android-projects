package com.dismas.imaya.bits;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by imaya on 4/4/16.
 */
public class MainVideoCamera extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video_camera);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new CaptureDemoFragment()).commit();
        }
    }
}
