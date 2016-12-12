package com.dismas.imaya.touradvisor.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dismas.imaya.touradvisor.R;
import com.dismas.imaya.touradvisor.constructors.ParksAllConstructor;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by imaya on 12/9/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ParksAllConstructor> parkList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ParksAllConstructor> itemList) {
        this.parkList = itemList;
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
        holder.parkName.setText(parkList.get(position).getSite_name());//setImageBitmap(itemList.get(position).get_media());
        //holder.storyMedia.setImageDrawable(Drawable.createFromPath(itemList.get(position).get_media()));
        Picasso.with(context)
                .load(parkList.get(position).getSite_image())
                .placeholder(R.drawable.error)
                .into(holder.parkMedia);
        //holder.parkOpenhrs.setText(itemList.get(position).get_timestamp());
        holder.parkLocation.setText(parkList.get(position).getLocationName());
    }

    @Override
    public int getItemCount() {
        return this.parkList.size();
    }
}