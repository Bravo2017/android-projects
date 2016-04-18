package com.dismas.imaya.retrofit_trial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Dialog;

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
    Context context;

    public ListViewAdapter(List<GitModel> gitModelList, Context context){
        this.inflater = LayoutInflater.from(context);
        this.gitModelList = gitModelList;
        this.context = context;
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
                .load(gitModelList.get(position).getOwner().getAvatar_url()) //""+gitmodelList.get(position).getOwner().getAvatar_url()
                .into(holder.image);

        holder.text.setText(" Name: "+gitModelList.get(position).getName()
                +"\t id: "+gitModelList.get(position).getId()+"\n");

        holder.texttwo.setText(gitModelList.get(position).getOwner().getAvatar_url());

        holder.image.setOnClickListener(new MyOnClickListener(gitModelList, position));
        holder.text.setOnClickListener(new MyOnClickListener(gitModelList, position));
        holder.texttwo.setOnClickListener(new MyOnClickListener(gitModelList, position));
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

    private class MyOnClickListener implements View.OnClickListener {
        List<GitModel> gitModelList;
        int position;

        private MyOnClickListener(List<GitModel> gitModelList, int position) {
            this.gitModelList = gitModelList;
            this.position = position;
        }

        @Override
        public void onClick(View view) {
//            DialogTask loadDialog = new DialogTask(gitModelList,position,view);
//
//            loadDialog.execute();

            if (view instanceof ImageView) {

                String name = gitModelList.get(position).getOwner().getLogin();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(context, UserProfile.class);
                // sending data to new activity
                i.putExtra("name", name);
                view.getContext().startActivity(i);



            } else if(view instanceof TextView){
                String url = gitModelList.get(position).getOwner().getHtml_url();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(context, SingleListItem.class);
                // sending data to new activity
                i.putExtra("url", url);
                view.getContext().startActivity(i);
            }

        }
    }

}

