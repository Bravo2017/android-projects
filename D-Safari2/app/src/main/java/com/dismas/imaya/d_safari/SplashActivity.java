package com.dismas.imaya.d_safari;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewAnimator;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread(){

            public void run(){
                try{
                    final ViewAnimator image = (ViewAnimator) findViewById(R.id.splash);
                    image.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            // TODO Auto-generated method stub
                            Animation anim = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.animation_splash );
                            image.startAnimation(anim);
                            Intent gotStart = new Intent(SplashActivity.this, Animals.class);
                            startActivity( gotStart);
                        }
                    });

                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                    Log.e("log_tag","Error in splash!" + e.toString());;
                }finally{
                    Intent gotoStart = new Intent(SplashActivity.this,  Animals.class);
                    startActivity( gotoStart);
                }
            }
        };timer.start();
    }



}