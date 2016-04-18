package com.dismas.imaya.retrofit_trial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by imaya on 4/16/16.
 */
public class ListViewAdapter extends BaseAdapter implements Filterable {

    LayoutInflater inflater;
    List<GitModel> gitModelList;
    List<GitModel> filteredGitModelList;
    Context context;

    private ItemFilter mFilter = new ItemFilter();

    public ListViewAdapter(List<GitModel> gitModelList, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.gitModelList = gitModelList;
        this.filteredGitModelList = gitModelList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return filteredGitModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return filteredGitModelList.get(position);
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
                .load(filteredGitModelList.get(position).getOwner().getAvatar_url()) //""+gitmodelList.get(position).getOwner().getAvatar_url()
                .placeholder(R.drawable.placeholder)
                .into(holder.image);

        holder.text.setText(" Name: " + filteredGitModelList.get(position).getName()
                + "\t id: " + filteredGitModelList.get(position).getId() + "\n");

        holder.texttwo.setText(filteredGitModelList.get(position).getOwner().getLogin());

        holder.image.setOnClickListener(new MyOnClickListener(filteredGitModelList, position));
        holder.text.setOnClickListener(new MyOnClickListener(filteredGitModelList, position));
        holder.texttwo.setOnClickListener(new MyOnClickListener(filteredGitModelList, position));
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.image_in_item)
        ImageView image;
        @Bind(R.id.textview_in_item)
        TextView text;
        @Bind(R.id.textview_in_item_two)
        TextView texttwo;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public void setGitmodel(List<GitModel> gitModelList) {
        clearGitmodel();
        this.gitModelList = gitModelList;
        this.filteredGitModelList = gitModelList;
        notifyDataSetChanged();
    }

    public void clearGitmodel() {
        this.gitModelList.clear();
        this.filteredGitModelList.clear();
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


            if (view instanceof ImageView) {

                String url = gitModelList.get(position).getOwner().getHtml_url();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(context, GitRepoWebActivity.class);
                // sending data to new activity
                i.putExtra("url", url);
                view.getContext().startActivity(i);

            } else if (view instanceof TextView) {
                String name = gitModelList.get(position).getOwner().getLogin();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(context, UserProfileActivity.class);
                // sending data to new activity
                i.putExtra("name", name);
                view.getContext().startActivity(i);
            }

        }
    }

    public Filter getFilter() {
        return mFilter;
    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            String filterString = constraint.toString().toLowerCase();

            FilterResults results = new FilterResults();

            final List<GitModel> list = gitModelList;

            int count = list.size();
            final ArrayList<GitModel> nlist = new ArrayList<GitModel>(count);

            GitModel filterableGitModel;

            for (int i = 0; i < count; i++) {
                filterableGitModel = list.get(i);
                if (filterableGitModel.getOwner().getLogin().toLowerCase().contains(filterString)) {
                    nlist.add(filterableGitModel);
                }
            }

            results.values = nlist;
            results.count = nlist.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
            filteredGitModelList = (ArrayList<GitModel>) results.values;
            notifyDataSetChanged();
        }

    }

}

