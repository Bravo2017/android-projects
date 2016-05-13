package com.dismas.imaya.combapiadapter.Adapter;

import android.support.v7.app.ActionBarActivity;

import com.dismas.imaya.combapiadapter.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * Created by imaya on 5/13/16.
 */
public class ItemObject extends ActionBarActivity {
    private String title;
    private int media;

    public ItemObject(String title, int media) {
        this.title = title;
        this.media = media;
    }

    public String get_title() {
        return title;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public int get_media() {
        return media;
    }

    public void set_media(int media) {
        this.media = media;
    }


}
