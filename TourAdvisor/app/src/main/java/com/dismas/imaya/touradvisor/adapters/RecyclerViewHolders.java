package com.dismas.imaya.touradvisor.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dismas.imaya.touradvisor.R;

/**
 * Created by imaya on 12/9/16.
 */
public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView parkName;
    public ImageView parkMedia;
    public TextView parkOpenhrs;
    public TextView parkLocation;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        parkName = (TextView)itemView.findViewById(R.id.park_name);
        parkMedia = (ImageView)itemView.findViewById(R.id.park_media);
        parkOpenhrs = (TextView)itemView.findViewById(R.id.park_openhrs);
        parkLocation = (TextView)itemView.findViewById(R.id.park_location);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Park Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
