package com.dismas.imaya.retrofit_trial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by imaya on 4/16/16.
 */
public class ListViewAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<GitModel> gitModelList;

    public ListViewAdapter(LayoutInflater inflater, List<GitModel> gitModelList){
        this.inflater = inflater;
        this.gitModelList = gitModelList;
    }

    @Override
    public int getCount() {
        return gitModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return gitModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_list_view, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Picasso.with(inflater.getContext())
                .load(gitModelList.get(position).getOwner().getAvatar_url())
                .into(holder.image);

        holder.text.setText(" Name: "+gitModelList.get(position).getName()
                +"\t id: "+gitModelList.get(position).getId()+"\n");
        holder.texttwo.setText(gitModelList.get(position).getOwner().getAvatar_url());

        return convertView;
    }

    static class ViewHolder{
        @Bind(R.id.image_in_item)
        ImageView image;
        @Bind(R.id.textview_in_item)
        TextView text;
        @Bind(R.id.textview_in_item_two)
        TextView texttwo;

        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }
    }

    public void setGitmodel(List<GitModel> gitModelList){
        clearGitmodel();
        this.gitModelList = gitModelList;
        notifyDataSetChanged();
    }

    public void clearGitmodel(){
        this.gitModelList.clear();
    }
}

