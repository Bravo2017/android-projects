package com.dismas.imaya.touradvisor.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dismas.imaya.touradvisor.R;

/**
 * Created by imaya on 12/9/16.
 */
public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    Context context;
    OnItemClickListener mItemClickListener;

    public TextView parkName;
    public ImageView parkMedia;
    public TextView parkOpenhrs;
    public TextView parkLocation;
    public LinearLayout placeNameHolder;
    public TextView costPerday;
    public LinearLayout placeHolder;


    public RecyclerViewHolders(View itemView) {
        super(itemView);
//        itemView.setOnClickListener(this);
        placeHolder = (LinearLayout) itemView.findViewById(R.id.mainHolder);
        parkName = (TextView)itemView.findViewById(R.id.park_name);
        parkMedia = (ImageView)itemView.findViewById(R.id.park_media);
        parkOpenhrs = (TextView)itemView.findViewById(R.id.park_openhrs);
        parkLocation = (TextView)itemView.findViewById(R.id.park_location);
        placeNameHolder = (LinearLayout) itemView.findViewById(R.id.placeNameHolder);
        costPerday = (TextView)itemView.findViewById(R.id.cost_per_day);

//        placeHolder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Park Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        if (mItemClickListener != null) {
            mItemClickListener.onItemClick(itemView, getPosition());
        }
    }
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

}
