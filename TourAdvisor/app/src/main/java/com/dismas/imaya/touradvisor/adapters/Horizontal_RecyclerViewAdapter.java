package com.dismas.imaya.touradvisor.adapters;

import android.content.Context;
import android.os.StrictMode;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dismas.imaya.touradvisor.R;
import com.dismas.imaya.touradvisor.constructors.ParksAllConstructor;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by imaya on 12/18/16.
 */

public class Horizontal_RecyclerViewAdapter extends RecyclerView.Adapter<Horizontal_RecyclerViewAdapter.ViewHolder> {

    RecyclerViewAdapter.OnItemClickListener mItemClickListener;

    private List<ParksAllConstructor> parkList;
    private Context context;

    public Horizontal_RecyclerViewAdapter(Context context, List<ParksAllConstructor> itemList) {
        this.parkList = itemList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView parkName;
        public ImageView parkMedia;
        public TextView parkOpenhrs;
        public TextView parkLocation;
        public LinearLayout placeNameHolder;
        public TextView costPerday;
        public LinearLayout placeHolder;

        public ViewHolder(View itemView) {
            super(itemView);
            placeHolder = (LinearLayout) itemView.findViewById(R.id.mainHolder);
            parkName = (TextView)itemView.findViewById(R.id.park_name);
            parkMedia = (ImageView)itemView.findViewById(R.id.park_media);
            parkOpenhrs = (TextView)itemView.findViewById(R.id.park_openhrs);
            parkLocation = (TextView)itemView.findViewById(R.id.park_location);
            placeNameHolder = (LinearLayout) itemView.findViewById(R.id.placeNameHolder);
            costPerday = (TextView)itemView.findViewById(R.id.cost_per_day);

            placeHolder.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            if (mItemClickListener != null) {
                mItemClickListener.onItemClick(itemView, getPosition());
            }

        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(final RecyclerViewAdapter.OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public Horizontal_RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_card_view_list, null);
//        ViewHolder rcv = new ViewHolder(layoutView);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_places, parent, false);
//        return new ViewHolder(view);
        return new Horizontal_RecyclerViewAdapter.ViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(final Horizontal_RecyclerViewAdapter.ViewHolder holder, final int position) {
        holder.parkName.setText(parkList.get(position).getSite_name());//setImageBitmap(itemList.get(position).get_media());
        //holder.storyMedia.setImageDrawable(Drawable.createFromPath(itemList.get(position).get_media()));
        Picasso.with(context)
                .load(parkList.get(position).getSite_image())
                .resize(500, 400)
                .placeholder(R.drawable.error)
                .into(holder.parkMedia);
        //holder.parkOpenhrs.setText(itemList.get(position).get_timestamp());
        //holder.parkLocation.setText(parkList.get(position).getLocationName());
        holder.costPerday.setText(parkList.get(position).getCost_per_day());

//        Toast.makeText(context, parkList.get(position).getSite_image(), Toast.LENGTH_SHORT).show();
//        try {
//            URL url = new URL(parkList.get(position).getSite_image());
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoInput(true);
//            connection.connect();
//            InputStream input = connection.getInputStream();
//            Bitmap photo = BitmapFactory.decodeStream(input);
//            Palette.generateAsync(photo, new Palette.PaletteAsyncListener() {
//                public void onGenerated(Palette palette) {
//                    int bgColor = palette.getMutedColor(context.getResources().getColor(android.R.color.black));
//                    holder.placeNameHolder.setBackgroundColor(bgColor);
//                }
//            });
//        } catch(IOException e) {
//            System.out.println(e);
//        }
    }

    @Override
    public int getItemCount() {
        return this.parkList.size();
    }
}