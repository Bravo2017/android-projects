package com.dismas.imaya.retrofit_trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    String API = "https://api.github.com"; // BASE URL
    LayoutInflater inflater;
    List<GitModel> placeholderModel;
    ListViewAdapter listAdapter;
    @Bind(R.id.listView)
    ListView list;
    @Bind(R.id.texv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        placeholderModel = new ArrayList<>();
        listAdapter = new ListViewAdapter(placeholderModel, this);

        list.setAdapter(listAdapter);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();  //create an adapter for retrofit with base url

        GitApi git = restAdapter.create(GitApi.class);  //creating a service for adapter with our GET class

        git.getFeed(new Callback<List<GitModel>>() {
            @Override
            public void failure(RetrofitError error) {
                tv.setText(error.getMessage());
            }
            @Override
            public void success(final List<GitModel> gitmodel, Response response) {
                listAdapter.setGitmodel(gitmodel);
            }
        });
    }
}
