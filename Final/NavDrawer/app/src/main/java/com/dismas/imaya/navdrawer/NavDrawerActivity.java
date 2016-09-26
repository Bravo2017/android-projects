package com.dismas.imaya.navdrawer;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import junit.framework.Test;

import java.util.ArrayList;

public class NavDrawerActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Light - Mocked Account");
        list.add("Dark  - Mocked Account");

        list.add("Light - Accounts");
        list.add("Dark  - Accounts");

        list.add("Light - Drawer Header Image");
        list.add("Dark  - Drawer Header Image");

        list.add("Light - No Drawer Header");
        list.add("Dark  - No Drawer Header");

        list.add("Light - Custom Drawer Header");
        list.add("Dark  - Custom Drawer Header");

        list.add("Functionality: unique Toolbar Color");
        list.add("Functionality: ripple backport support");
        list.add("Functionality: multi pane support for tablet");
        list.add("Functionality: custom section under account list");
        list.add("Functionality: Kitkat trasluncent status bar");
        list.add("Functionality: Master/Child example");
        list.add("Functionality: section not pre-rendered");
        list.add("Functionality: default section loaded");
        list.add("Functionality: action bar shadow enabled (toolbar elevation)");
        list.add("Functionality: learning pattern disabled");

        list.add("Back Pattern: Back To first");
        list.add("Back Pattern: Back Anywhere");
        list.add("Back Pattern: Custom");

//        list.add("Test");

        this.setListAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list));
        this.getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch(position) {
            case 0:
                intent = new Intent(this,MockedAccount.class);
                break;
            case 1:
                intent = new Intent(this, it.neokree.example.dark.MockedAccount.class);
                break;
            case 2:
                intent = new Intent(this,Accounts.class);
                break;
            case 3:
                intent = new Intent(this, it.neokree.example.dark.Accounts.class);
                break;
            case 4:
                intent = new Intent(this,ImageDrawerHeader.class);
                break;
            case 5:
                intent = new Intent(this, it.neokree.example.dark.ImageDrawerHeader.class);
                break;
            case 6:
                intent = new Intent(this,NoDrawerHeader.class);
                break;
            case 7:
                intent = new Intent(this, it.neokree.example.dark.NoDrawerHeader.class);
                break;
            case 8:
                intent = new Intent(this, CustomDrawerHeader.class);
                break;
            case 9:
                intent = new Intent(this, it.neokree.example.dark.CustomDrawerHeader.class);
                break;
            case 10:
                intent = new Intent(this, UniqueToolbarColor.class);
                break;
            case 11:
                intent = new Intent(this, RippleBackport.class);
                break;
            case 12:
                intent = new Intent(this, MultiPane.class);
                break;
            case 13:
                intent = new Intent(this, CustomAccountSection.class);
                break;
            case 14:
                intent = new Intent(this, KitkatStatusBar.class);
                break;
            case 15:
                intent = new Intent(this, MasterChildActivity.class);
                break;
            case 16:
                intent = new Intent(this, RealColorSections.class);
                break;
            case 17:
                intent = new Intent(this, DefaultSectionLoaded.class);
                break;
            case 18:
                intent = new Intent(this, ActionBarShadow.class);
                break;
            case 19:
                intent = new Intent(this, LearningPatternDisabled.class);
                break;
            case 20:
                intent = new Intent(this, BackToFirst.class);
                break;
            case 21:
                intent = new Intent(this, BackAnywhere.class);
                break;
            case 22:
                intent = new Intent(this, BackPatternCustom.class);
                break;
            case 23:
                intent = new Intent(this, Test.class);
                break;
            default:
                intent = null;
        }
        startActivity(intent);
    }
}