package com.spot.e.espot_beta;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by imaya on 3/8/16.
 */
public class Documentaries extends ListActivity {


    String documentaries[] =

            {

                    "Maya Angelou: And Still I Rise",
                    "Nothing Left Unsaid: Gloria Vanderbilt & Anderson Cooper",
                    "Under the Gun",
                    "Newtown",
                    "Holy Hell",
                    "Mapplethorpe: Look at the Pictures",
                    "Life, Animated",
                    "Lo and Behold: Reveries of the Connected World",
                    "Weiner",
                    "Michael Jackson's Journey from Motown to Off the Wall",
                    "Uncle Howard",
                    "Unlocking the Cage",
                    "How to Let Go of the World and Love All the Things That Climate Can't Change",
                    "Norman Lear: Just Another Version of You",
                    "Tickled",
                    "The Lovers and the Despot",
                    "Jim: The James Foley Story",
                    "Kiki",

            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.movies);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, documentaries));
    }

    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, "Your Choice is " + documentaries[position], Toast.LENGTH_LONG).show();
    }
}
