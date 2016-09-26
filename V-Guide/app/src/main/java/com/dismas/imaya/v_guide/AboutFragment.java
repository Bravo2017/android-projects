package com.dismas.imaya.v_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import static com.dismas.imaya.v_guide.R.id.profileImage;
import static com.dismas.imaya.v_guide.R.id.textViewUsername;

/**
 * Created by imaya on 9/21/16.
 */
public class AboutFragment extends BaseFragment {
    @Override
    public String getTitle() {
        return getString(R.string.about);
    }
    public AboutFragment () {
        // empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_about, container, false);
        // Inflate the layout for this fragment

        return rootView;
    }
}
