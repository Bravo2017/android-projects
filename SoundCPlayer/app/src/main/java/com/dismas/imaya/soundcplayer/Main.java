package com.dismas.imaya.soundcplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Main extends AppCompatActivity {

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
        //SCService scService = restAdapter.create(SCService.class);
        SCService scService = SoundCloud.getService();
        scService.getRecentTracks(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()), new Callback<List<Track>>() {
            @Override
            public void success(List<Track> tracks, Response response) {
                Log.d(TAG, "First track title: " + tracks.get(0).getTitle());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, "Error: " + error);
            }
        });
    }
}
