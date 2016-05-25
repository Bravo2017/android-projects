package com.dismas.imaya.directapi.Adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * Created by imaya on 5/13/16.
 */
public class ItemObject {
    private String title;
    private String media;
    private String timestamp;
    private String location;

    public ItemObject(String title, String media, String timestamp, String location) {
        this.title = title;
        this.media = media;
        this.timestamp = timestamp;
        this.location = location;
    }

    public String get_title() {
        return title;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public String get_media() {
        return media;
    }

    public void set_media(String media) {
        this.media = media;
    }
    public String get_timestamp() {
        return timestamp;
    }

    public void set_timestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String get_location() {
        return location;
    }

    public void set_location(String location) {
        this.location = location;
    }


}
