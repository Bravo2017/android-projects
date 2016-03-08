package com.spot.e.espot;

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
         */
        addSlide(new SimpleSlide.Builder()
                .title(R.string.title)
                .description(R.string.description_1)
                .image(R.drawable.orphanage)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
                .title(R.string.title)
                .description(R.string.description_1)
                .image(R.drawable.chyulu)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
                .title(R.string.title)
                .description(R.string.description_1)
                .image(R.drawable.marsabit)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
                .title(R.string.title)
                .description(R.string.description_1)
                .image(R.drawable.mtkenya)
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
}