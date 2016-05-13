package com.dismas.imaya.evrybitapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;


import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.txtResult)
    TextView txtResult;
    @Bind(R.id.image_in_item)
    ImageView image_in_item;
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

                txtResult.setMovementMethod(new ScrollingMovementMethod());
//                Picasso.with(getApplicationContext())
//                        .load(all.objects.get(0).getAvatar())
//                        .placeholder(R.drawable.placeholder)
//                        .into(image_in_item);

//                filteredGitModelList.get(position).getOwner().getAvatar_url() 

                for (int i = 0; i < all.objects.size(); i++) {
                    Picasso.with(getApplicationContext())
                            .load(all.objects.get(0).getAvatar())

                            .into(image_in_item);

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