package com.dismas.imaya.snackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CoordinatorLayout Clayout = (CoordinatorLayout)findViewById(R.id.snackbarlocation);

        FloatingActionButton FabButton = null;

        FabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(Clayout, "This snack bar located at top", Snackbar.LENGTH_SHORT).show();
            }
        });

        View.OnClickListener snackbarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }


}
