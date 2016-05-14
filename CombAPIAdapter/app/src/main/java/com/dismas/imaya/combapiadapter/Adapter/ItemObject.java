package com.dismas.imaya.combapiadapter.Adapter;

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

    public ItemObject(String title, String media) {
        this.title = title;
        this.media = media;
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


}
