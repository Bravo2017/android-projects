package com.dismas.imaya.touradvisor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by imaya on 11/6/16.
 */

public class AppIntroPagerAdapter extends FragmentPagerAdapter {

    public AppIntroPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return AppIntroFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}