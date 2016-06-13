package com.dismas.imaya.info_parks;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(null);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);

        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == R.id.kenya) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    //fragmentTransaction.replace(R.id.containerView,new TrendingFragment()).commit();
                    fragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();

                }

                if (menuItem.getItemId() == R.id.rift_valley) {
                    FragmentTransaction afragmentTransaction = mFragmentManager.beginTransaction();
                    //afragmentTransaction.replace(R.id.containerView,new ProvincesFragment()).commit();
                    afragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.nairobi) {
                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
                    bfragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.central) {
                    FragmentTransaction cfragmentTransaction = mFragmentManager.beginTransaction();
                    cfragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.western) {
                    FragmentTransaction dfragmentTransaction = mFragmentManager.beginTransaction();
                    dfragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.nyanza) {
                    FragmentTransaction efragmentTransaction = mFragmentManager.beginTransaction();
                    efragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.eastern) {
                    FragmentTransaction efragmentTransaction = mFragmentManager.beginTransaction();
                    efragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.north_eastern) {
                    FragmentTransaction efragmentTransaction = mFragmentManager.beginTransaction();
                    efragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.coast) {
                    FragmentTransaction efragmentTransaction = mFragmentManager.beginTransaction();
                    efragmentTransaction.replace(R.id.containerView,new GameParksFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.nav_item_about) {
                    FragmentTransaction ffragmentTransaction = mFragmentManager.beginTransaction();
                    ffragmentTransaction.replace(R.id.containerView,new AboutFragment()).commit();
                }


                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}