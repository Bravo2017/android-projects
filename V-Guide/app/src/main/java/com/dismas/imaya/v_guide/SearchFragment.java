package com.dismas.imaya.v_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by imaya on 9/21/16.
 */
public class SearchFragment extends BaseFragment {
    public SearchFragment () {
        // empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        // Inflate the layout for this fragment
        TextView btnSearch = (TextView) rootView.findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchActivity();
            }
        });

        EditText searchField = (EditText) rootView.findViewById(R.id.search_field);
        searchField.setRawInputType(InputType.TYPE_CLASS_TEXT);
        searchField.setInputType(InputType.TYPE_NULL);
        searchField.setTextIsSelectable(true);
        searchField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchActivity();
            }
        });


        return rootView;

    }

    private void openSearchActivity() {

        // TODO: Add functionality
        Intent i = new Intent(getContext(), SearchResults.class);
        startActivity(i);
    }

    @Override
    public String getTitle() {
        return getString(R.string.search);
    }
}
