package com.dismas.imaya.directapi.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dismas.imaya.directapi.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by imaya on 5/13/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<StoryObjects> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<StoryObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        //holder.storyTitle.setText(itemList.get(position).get_title());//setImageBitmap(itemList.get(position).get_media());
        holder.storyTitle.setText(itemList.get(position).getTitle());
        //holder.storyMedia.setImageDrawable(Drawable.createFromPath(itemList.get(position).get_media()));
        Picasso.with(context)
                            .load(itemList.get(position).getMedia())
                            .placeholder(R.drawable.placeholder)
                            .into(holder.storyMedia);
        holder.storyDate.setText(itemList.get(position).getTimestamp());
        holder.storyLocation.setText(itemList.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

//    @Override
//    public int getItemCount() {
//        return this.itemList.size();
//    }
}