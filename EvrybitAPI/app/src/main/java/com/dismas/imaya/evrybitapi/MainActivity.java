package com.dismas.imaya.evrybitapi;

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
    @Bind(R.id.txtResult)
    TextView txtResult;
    String API = "http://52.37.33.186/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();                                        //create an adapter for retrofit with base url

        StoryApi story = restAdapter.create(StoryApi.class);                            //creating a service for adapter with our GET class


        story.getFeed(new Callback<All>() {

            @Override
            public void success(All all, Response response) {
                //we get json object from github server to our POJO or model class
//                Log.d("success","got data");
                txtResult.setMovementMethod(new ScrollingMovementMethod());

                for (int i = 0; i < all.objects.size(); i++) {
                    txtResult.append("Title: " + all.objects.get(i).getTitle() + "\n Email: "
                            + all.objects.get(i).getUser_id() + "\n Content: "
                            + all.objects.get(i).getIntro() + "\n\n");
                }

            }

            @Override
            public void failure(RetrofitError error) {
                txtResult.setText(error.getMessage());
            }
        });

    }
}
