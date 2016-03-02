package com.dismas.imaya.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by imaya on 3/2/16.
 */
public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_DURATION = 1000;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                Intent mainIntent = new Intent(SplashActivity.this, menu.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_DURATION);
    }
}
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splash);
//
//        int secondsDelayed = 1;
//        new Handler().postDelayed(new Runnable() {
//                public void run() {
//                        startActivity(new Intent(SplashActivity.this, menu.class));
//                        finish();
//                }
//        }, secondsDelayed * 1000);
//    }
//}