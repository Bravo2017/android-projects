package com.dismas.imaya.touradvisor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DiscoverFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_discover,container, false);

        // Inflate the layout for this fragment
        return x;
    }

}
