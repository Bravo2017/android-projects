package com.dismas.imaya.touradvisor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by imaya on 12/2/16.
 */
public class AboutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_about,container, false);
        ((MainActivityDrawer) getActivity()).topToolBar.setTitle("About");

        // Inflate the layout for this fragment
        return x;
    }
}
