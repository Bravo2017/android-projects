package com.dismas.imaya.touradvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by imaya on 11/3/16.
 */

public class AppIntro extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    @Bind(R.id.container)
    ViewPager viewPager;
    @Bind(R.id.image_button_next)
    ImageButton imgBtnNext;

    private AppIntroPagerAdapter mAppIntroPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        runOnce();

        setContentView(R.layout.activity_appintro);

        ButterKnife.bind(this);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mAppIntroPagerAdapter = new AppIntroPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAppIntroPagerAdapter);
        viewPager.setOffscreenPageLimit(4);
        //set page transformer
        viewPager.setPageTransformer(false, new FadePageTransformerUtil());

        viewPager.addOnPageChangeListener(this);
    }

    private void runOnce() {
        if (!SettingsPreferences.isNewInstall(AppIntro.this)) {
            runIntent(SignupActivity.class);
            finish();
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                imgBtnNext.setImageResource(R.drawable.ic_arrow_forward_white_24dp);
                break;
            case 1:
                imgBtnNext.setImageResource(R.drawable.ic_arrow_forward_white_24dp);
                break;
            case 2:
                imgBtnNext.setImageResource(R.drawable.ic_arrow_forward_white_24dp);
                break;
            case 3:
                imgBtnNext.setImageResource(R.drawable.ic_done_white_24dp);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @OnClick(R.id.image_button_next)
    public void OnNext() {
        if (viewPager.getCurrentItem() == 3) {
            SettingsPreferences.setNewInstall(AppIntro.this);
            runIntent(SignupActivity.class);
            finish();
        } else if (viewPager.getCurrentItem() < 3) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        }
    }

    private void runIntent(Class resultActivity) {
        Intent intent = new Intent(AppIntro.this, resultActivity);
        startActivity(intent);
    }

}