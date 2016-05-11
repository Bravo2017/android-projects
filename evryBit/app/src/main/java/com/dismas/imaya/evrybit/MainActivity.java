package com.dismas.imaya.evrybit;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
@InnerKey("objects")
public class MainActivity extends ActionBarActivity {
    @Bind(R.id.texv)
    TextView tv;
    String API = "http://api.getevrybit.com/";                         //BASE URL

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
            public void success(List<GitModel> gitModels, Response response) {
                //we get json object from github server to our POJO or model class
//                Log.d("success","got data");
                tv.setMovementMethod(new ScrollingMovementMethod());

                for (int i = 0; i < gitModels.size(); i++) {
                    tv.append("Title: " + gitModels.get(i).getOwner()+ "\n Email: "
                            + gitModels.get(i).getOwner().getUser_id() + "\n Content: "
                            + gitModels.get(i).getOwner().getIntro() + "\n");
                }
            }
            @Override
            public void failure(RetrofitError error) {
                tv.setText(error.getMessage());
            }
        });
    }


}
