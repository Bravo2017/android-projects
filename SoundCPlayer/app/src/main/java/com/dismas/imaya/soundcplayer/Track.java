package com.dismas.imaya.soundcplayer;

import com.google.gson.annotations.SerializedName;

/**
 * Created by imaya on 3/12/16.
 */
public class Track {

    @SerializedName("title")
    private String mTitle;

    @SerializedName("id")
    private int mID;

    @SerializedName("stream_url")
    private String mStreamURL;
    //private String mStreamURL = "http://api.soundcloud.com/tracks/13158665.json?client_id=6879e13702256246d424c35face10dad";

    @SerializedName("artwork_url")
    private String mArtworkURL;

    public String getTitle() {
        return mTitle;
    }

    public int getID() {
        return mID;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public String getArtworkURL() {
        return mArtworkURL;
    }
}
