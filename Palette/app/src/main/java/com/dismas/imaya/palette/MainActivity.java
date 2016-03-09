package com.dismas.imaya.palette;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;


import com.musenkishi.atelier.Atelier;
import com.musenkishi.atelier.ColorType;
import com.musenkishi.atelier.swatch.VibrantSwatch;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class MainActivity extends AbsCountryAdapter {


    @Override
    protected void renderImageAndColors(final AbsCountryAdapter.ViewHolder viewHolder, final String url) {
        Picasso.with(viewHolder.rootView.getContext())
                .load(url)
                .into(viewHolder.imageView, new Callback.EmptyCallback() {
                    @Override
                    public void onSuccess() {
                        Drawable drawable = viewHolder.imageView.getDrawable();
                        if (drawable instanceof BitmapDrawable) {


                            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();


                            Atelier.with(url)
                                    .load(bitmap)
                                    .swatch(new VibrantSwatch(ColorType.BACKGROUND))
                                    .into(viewHolder.rootView);


                            Atelier.with(url)
                                    .load(bitmap)
                                    .swatch(new VibrantSwatch(ColorType.TEXT_TITLE))
                                    .into(viewHolder.textView);
                        }
                    }
                });
    }
}
