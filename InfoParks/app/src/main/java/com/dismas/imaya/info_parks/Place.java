package com.dismas.imaya.info_parks;

import android.content.Context;

/**
 * Created by imaya on 6/6/16.
 */
public class Place {
    public String name;
    public String imageName;
    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
