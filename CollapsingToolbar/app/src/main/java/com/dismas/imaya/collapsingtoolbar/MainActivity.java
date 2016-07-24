package com.dismas.imaya.collapsingtoolbar;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbar.setTitle("Dismas Imaya");
        //this will change the display title text color.

//        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.black));
//        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.colorPrimary));
        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimary));

        collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
    }

}
