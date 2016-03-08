package com.spot.e.espot_beta;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

/**
 * Created by imaya on 3/8/16.
 */
public class MainIntroActivity extends IntroActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        /**
         * Standard slide (like Google's intros)
         * R.string.title
         */
        addSlide(new SimpleSlide.Builder()
                .title(R.string.title)
                .description(R.string.description_1)
                .description(R.string.description_2)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
//                .title(R.string.title)
                .description(R.string.description_3)
                .image(R.drawable.movies)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
//                .title(R.string.title)
                .description(R.string.description_4)
                .image(R.drawable.series)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
//                .title(R.string.title)
                .description(R.string.description_5)
                .image(R.drawable.animation)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
//                .title(R.string.title)
                .description(R.string.description_6)
                .image(R.drawable.documentary)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());


        /* Enable/disable fullscreen */
        setFullscreen(true);

//        super.onCreate(savedInstanceState);

        /* Enable/disable skip button */
        setSkipEnabled(true);

        /* Enable/disable finish button */
        setFinishEnabled(true);

        /* Add your own page change listeners */


        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


    }
    public void onStop(){
        super.onStop();
        final Context context = this;
        Intent intent = new Intent(context,Main.class);
        startActivity(intent);

    }
}