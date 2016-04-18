package com.dismas.imaya.retrofit_trial;

import android.app.Activity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener {

    String API = "https://api.github.com";                         //BASE URL
    GitApi git;
    List<GitModel> placeholderModel;
    ListViewAdapter listAdapter;

    @Bind(R.id.swipe_container)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Bind(R.id.empty)
    TextView emptyView;
    @Bind(R.id.listView)
    ListView list;
    @Bind(R.id.filterbar)
    EditText mFilterString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSwipeRefreshLayout.setOnRefreshListener(this);
        mFilterString.addTextChangedListener(searchTextWatcher);

        placeholderModel = new ArrayList<>();
        listAdapter = new ListViewAdapter(placeholderModel, this);


        list.setEmptyView(emptyView);
        list.setAdapter(listAdapter);


        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();                                        //create an adapter for retrofit with base url

        git = restAdapter.create(GitApi.class);                            //creating a service for adapter with our GET class

        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
    }

    @Override
    public void onRefresh() {
        git.getFeed(new Callback<List<GitModel>>() {
            @Override
            public void failure(RetrofitError error) {
                mSwipeRefreshLayout.setRefreshing(false);
                Toast.makeText(getApplicationContext(), "Failed to load", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void success(final List<GitModel> gitmodel, Response response) {
                mSwipeRefreshLayout.setRefreshing(false);
                listAdapter.setGitmodel(gitmodel);
            }
        });
    }

    private TextWatcher searchTextWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // ignore
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            // ignore
        }

        @Override
        public void afterTextChanged(Editable s) {
            listAdapter.getFilter().filter(s.toString());
        }
    };
}
