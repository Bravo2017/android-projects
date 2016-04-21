package com.dismas.imaya.working_json;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by imaya on 4/22/16.
 */
public class ItemAdapter extends ArrayAdapter<ClipData.Item> {

    public ItemAdapter(Context c, List<ClipData.Item> items) {
        super(c, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MenuView.ItemView itemView = (MenuView.ItemView)convertView;
        if (null == itemView)
            itemView = MenuView.ItemView.inflate(parent);
        itemView.setItem(getItem(position));
        return itemView;
    }

}