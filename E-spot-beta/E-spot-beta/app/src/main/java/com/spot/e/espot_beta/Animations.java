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
public class Animations extends ListActivity {


    String [] animations =
            {
                    "Home",
                    "Zootopia",
                    "Angry Birds",
                    "KungFu panda 3",
                    "Finding Dory",
                    "Ratchet and Clank Focus",
                    "Ice Age: Collision Course",
                    "The Secret Life of Pets",
                    "Norm of the North",
                    "Sing",
                    "Minions",
                    "The Good Dinosaur",
                    "Trolls",
                    "Moana",
                    "The Red Turtle",
                    "The Monk and the Fish",
                    "Cinderella ",
                    "Sly Cooper",

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.movies);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animations));
    }

    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, "Your Choice is " + animations[position], Toast.LENGTH_LONG).show();
    }
}

