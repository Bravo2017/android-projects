package com.dismas.imaya.snackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CoordinatorLayout Clayout = (CoordinatorLayout)findViewById(R.id.snackbarlocation);
        FloatingActionButton FabButton = (FloatingActionButton) findViewById(R.id.add_fab_button);
        FloatingActionButton Fab = (FloatingActionButton) findViewById(R.id.add_fab_button1);

        FabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(Clayout, "You clicked the forward button", Snackbar.LENGTH_SHORT).show();
            }
        });

        Fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(Clayout, "You clicked the rewind button", Snackbar.LENGTH_SHORT).show();
            }
        });

        View.OnClickListener snackbarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }


}
