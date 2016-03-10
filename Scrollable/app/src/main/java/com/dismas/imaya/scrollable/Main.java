package com.dismas.imaya.scrollable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.michelelacorte.scrollableappbar.ScrollableAppBar;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollableAppBar appBarLayout = (ScrollableAppBar) findViewById(R.id.appbar);

//To give the effect "in the middle" of the image (like gif)
        appBarLayout.collapseToolbar();
        setContentView(R.layout.main);
    }
}
