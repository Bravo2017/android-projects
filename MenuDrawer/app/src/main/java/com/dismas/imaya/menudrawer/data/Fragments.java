package com.dismas.imaya.menudrawer.data;

import android.app.Fragment;

import com.dismas.imaya.menudrawer.ui.fragments.FragmentAbout;
import com.dismas.imaya.menudrawer.ui.fragments.FragmentOne;
import com.dismas.imaya.menudrawer.ui.fragments.FragmentThree;
import com.dismas.imaya.menudrawer.ui.fragments.FragmentTwo;

/**
 * Created by imaya on 12/2/16.
 */

public enum Fragments {
    ONE(FragmentOne.class), TWO(FragmentTwo.class), THREE(FragmentThree.class), ABOUT(
            FragmentAbout.class);

    final Class<? extends Fragment> fragment;

    private Fragments(Class<? extends Fragment> fragment) {
        this.fragment = fragment;
    }

    public String getFragment() {
        return fragment.getName();
    }
}
