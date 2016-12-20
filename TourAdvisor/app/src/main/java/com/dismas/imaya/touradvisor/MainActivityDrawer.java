package com.dismas.imaya.touradvisor;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by imaya on 12/2/16.
 */
public class MainActivityDrawer extends AppCompatActivity {


    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    String str_getName, str_getPassword, str_getEmail, str_getCity, str_getCountry;
    Toolbar topToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            setContentView(R.layout.activity_maindrawer);
        }

        str_getName = SplashActivity.sh.getString("name", null);
        str_getPassword = SplashActivity.sh.getString("password", null);
        str_getEmail = SplashActivity.sh.getString("email", null);
        str_getCity = SplashActivity.sh.getString("city", null);
        str_getCountry = SplashActivity.sh.getString("country", null);

        setTitle(null);

        topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("Home");

        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff);
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
        String profile = str_getName +" "+ str_getEmail;
        if(!SplashActivity.sh.contains("name"))
        {
            mNavigationView.getMenu().findItem(R.id.nav_item_profile).setTitle(str_getEmail);
        }
        else
        {
            mNavigationView.getMenu().findItem(R.id.nav_item_profile).setTitle(str_getName);
        }

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == R.id.nav_item_profile) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new ProfileFragment()).addToBackStack(null).commit();


                }

                if (menuItem.getItemId() == R.id.nav_item_home) {
                    FragmentTransaction afragmentTransaction = mFragmentManager.beginTransaction();
                    afragmentTransaction.replace(R.id.containerView,new TabFragment()).addToBackStack(null).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_mylist) {
                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
                    bfragmentTransaction.replace(R.id.containerView,new ParkFragment()).addToBackStack(null).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_mytours) {
                    FragmentTransaction cfragmentTransaction = mFragmentManager.beginTransaction();
                    cfragmentTransaction.replace(R.id.containerView,new ReserveFragment()).addToBackStack(null).commit();

                }

//                if (menuItem.getItemId() == R.id.nav_item_park) {
//                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
//                    bfragmentTransaction.replace(R.id.containerView,new ParkFragment()).addToBackStack(null).commit();
//
//                    topToolBar.setTitle("National Parks");
//
//
//                }
//                if (menuItem.getItemId() == R.id.nav_item_reserve) {
//                    FragmentTransaction cfragmentTransaction = mFragmentManager.beginTransaction();
//                    cfragmentTransaction.replace(R.id.containerView,new ReserveFragment()).addToBackStack(null).commit();
//
//                    topToolBar.setTitle("National Reserve");
//                }
//                if (menuItem.getItemId() == R.id.nav_item_marine) {
//                    FragmentTransaction cfragmentTransaction = mFragmentManager.beginTransaction();
//                    cfragmentTransaction.replace(R.id.containerView,new MarineFragment()).addToBackStack(null).commit();
//
//                    topToolBar.setTitle("Marine Parks");
//                }
//                if (menuItem.getItemId() == R.id.nav_item_sanctuaries) {
//                    FragmentTransaction cfragmentTransaction = mFragmentManager.beginTransaction();
//                    cfragmentTransaction.replace(R.id.containerView,new SanctuariesFragment()).addToBackStack(null).commit();
//
//                    topToolBar.setTitle("Sanctuaries");
//                }
//                if (menuItem.getItemId() == R.id.nav_item_orphanage) {
//                    FragmentTransaction cfragmentTransaction = mFragmentManager.beginTransaction();
//                    cfragmentTransaction.replace(R.id.containerView,new OrphanageFragment()).addToBackStack(null).commit();
//
//                    topToolBar.setTitle("Orphanage");
//                }
                if (menuItem.getItemId() == R.id.nav_item_site) {
                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
                    bfragmentTransaction.replace(R.id.containerView,new AllAttractionsFragment()).addToBackStack(null).commit();


                }
                if (menuItem.getItemId() == R.id.nav_item_accommodation) {
                    FragmentTransaction dfragmentTransaction = mFragmentManager.beginTransaction();
                    dfragmentTransaction.replace(R.id.containerView,new AccommodationFragment()).addToBackStack(null).commit();


                }
                if (menuItem.getItemId() == R.id.nav_item_account) {
                    FragmentTransaction efragmentTransaction = mFragmentManager.beginTransaction();
                    efragmentTransaction.replace(R.id.containerView,new AccountFragment()).addToBackStack(null).commit();

                }
                if (menuItem.getItemId() == R.id.nav_item_about) {
                    FragmentTransaction ffragmentTransaction = mFragmentManager.beginTransaction();
                    ffragmentTransaction.replace(R.id.containerView,new AboutFragment()).addToBackStack(null).commit();
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
        getMenuInflater().inflate(R.menu.search, menu);
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
            Toast.makeText(MainActivityDrawer.this, "Search", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            Intent intent = new Intent(MainActivityDrawer.this,
//                    SplashActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            intent.putExtra("EXIT", true);
//            startActivity(intent);
//        }
//        return super.onKeyDown(keyCode, event);
//    }
    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

}