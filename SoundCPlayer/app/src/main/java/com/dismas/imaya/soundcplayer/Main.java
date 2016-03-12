package com.dismas.imaya.soundcplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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
    private TextView mSelectedTrackTitle;
    private ImageView mSelectedTrackImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mListItems = new ArrayList<Track>();
        ListView listView = (ListView)findViewById(R.id.track_list_view);
        mAdapter = new SCTrackAdapter(this, mListItems);
        listView.setAdapter(mAdapter);

        mSelectedTrackTitle = (TextView)findViewById(R.id.selected_track_title);
        mSelectedTrackImage = (ImageView)findViewById(R.id.selected_track_image);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Track track = mListItems.get(position);

                mSelectedTrackTitle.setText(track.getTitle());
                Picasso.with(Main.this).load(track.getArtworkURL()).into(mSelectedTrackImage);

            }
        });

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
