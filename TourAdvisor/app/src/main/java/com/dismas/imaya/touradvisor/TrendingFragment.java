package com.dismas.imaya.touradvisor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TrendingFragment extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_trending,container, false);

        // Inflate the layout for this fragment
        return x;
    }

    @Override
    public void onClick(View v) {

    }
}
