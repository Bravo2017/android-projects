package com.dismas.imaya.v_guide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by imaya on 9/21/16.
 */
public class WeatherFragment extends BaseFragment {
    @Override
    public String getTitle() {
        return getString(R.string.weather);
    }
    public WeatherFragment () {
        // empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_weather, container, false);
        // Inflate the layout for this fragment

        return rootView;
    }
}
