package com.dismas.imaya.retrofit_trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.texv)
    TextView tv;
    String API = "https://api.github.com";                         //BASE URL

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();                                        //create an adapter for retrofit with base url

        GitApi git = restAdapter.create(GitApi.class);                            //creating a service for adapter with our GET class

        git.getFeed(new Callback<List<GitModel>>() {
            @Override
            public void failure(RetrofitError error) {
                tv.setText(error.getMessage());
            }

            @Override
            public void success(List<GitModel> GitModel, Response response) {
                //we get json object from github server to our POJO or model class
                tv.setMovementMethod(new ScrollingMovementMethod());
                for (int i = 0; i < GitModel.size(); i++) {
                    tv.append("" + GitModel.get(i).getName() + "\t id: "
                            + GitModel.get(i).getId() + "\t full name: "
                            + GitModel.get(i).getfullName() + "\t Avatar Url: "
                            + GitModel.get(i).getOwner().getAvatar_url() + "\n");
                }
            }
        });
    }
}
