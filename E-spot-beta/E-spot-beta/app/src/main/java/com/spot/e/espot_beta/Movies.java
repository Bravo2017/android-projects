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
public class Movies extends ListActivity {


    String [] movies = {

            "Batman Vs Superman- Dawn Of Justice",
            "Captain America - Civil War",
            "Deadpool",
            "X-men Apocalypse",
            "Suicide Squad",
            "The Jungle Book",
            "The Divergent series - Allegient",
            "Independence Day: Resurgence",
            "Rogue One : A star wars Story",
            "Doctor Strange",
            "13 Hours: The Secret Soldiers",
            "Star Treck Beyond",
            "Assasins Creed The Movie",
            "The 5th wave",
            "Ride Along 2",
            "The Huntsman: WInter's war",
            "The Birth of a nation",
            "Gods of Egypt",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.movies);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movies));
    }

    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, "Your Choice is " + movies[position], Toast.LENGTH_LONG).show();
    }


}
