package com.dismas.imaya.soundcplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Main extends AppCompatActivity {

    private static final String TAG = "Main";
    private List<Track> mListItems;
    private SCTrackAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mListItems = new ArrayList<Track>();
        ListView listView = (ListView)findViewById(R.id.track_list_view);
        mAdapter = new SCTrackAdapter(this, mListItems);
        listView.setAdapter(mAdapter);

        SCService scService = SoundCloud.getService();
        scService.getRecentTracks(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()), new Callback<List<Track>>() {
            @Override
            public void success(List<Track> tracks, Response response) {
                loadTracks(tracks);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, "Error: " + error);
            }
        });
    }
    private void loadTracks(List<Track> tracks) {
        mListItems.clear();
        mListItems.addAll(tracks);
        mAdapter.notifyDataSetChanged();
    }
}
