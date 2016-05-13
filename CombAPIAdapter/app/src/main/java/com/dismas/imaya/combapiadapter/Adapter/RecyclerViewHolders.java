package com.dismas.imaya.combapiadapter.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dismas.imaya.combapiadapter.R;

/**
 * Created by imaya on 5/13/16.
 */
public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView storyTitle;
    public ImageView storyMedia;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        storyTitle = (TextView)itemView.findViewById(R.id.story_title);
        storyMedia = (ImageView)itemView.findViewById(R.id.story_media);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Story Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
