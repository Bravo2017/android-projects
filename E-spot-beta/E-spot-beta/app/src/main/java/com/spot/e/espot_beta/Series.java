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
public class Series extends ListActivity {


    String [] series = {

            "Breaking Bad",
            "Game of Thrones",
            "The Returned",
            "Mad Men",
            "Girls",
            "Band of Brothers",
            "Planet Earth ",
            "The Wire",
            "Cosmos: A Spacetime Odyssey ",
            "Cosmos",
            "Rick and Morty ",
            "The Sopranos",
            "Sherlock",
            "The World at War",
            "Life",
            "Avatar: The Last Airbender",
            "Last Week Tonight with John Oliver",
            "True Detective",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.series);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, series));
    }

    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, "Your Choice is " + series[position], Toast.LENGTH_LONG).show();
    }


}

