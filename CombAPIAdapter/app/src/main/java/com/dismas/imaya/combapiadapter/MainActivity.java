package com.dismas.imaya.combapiadapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dismas.imaya.combapiadapter.Adapter.All;
import com.dismas.imaya.combapiadapter.Adapter.ItemObject;
import com.dismas.imaya.combapiadapter.Adapter.RecyclerViewAdapter;
import com.dismas.imaya.combapiadapter.Adapter.StoryApi;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity{

    private LinearLayoutManager lLayout;
    String API = "http://52.37.33.186/";
    List<ItemObject> allItems = new ArrayList<ItemObject>();

    /*Reads data from an API*/
    RestAdapter restAdapter = new RestAdapter.Builder()
            .setEndpoint(API).build();

    List<ItemObject> rowListItem = getAllItemList();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(null);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setLogo(R.drawable.logo);
        topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));


        lLayout = new LinearLayoutManager(MainActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);

    }

//    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState
//
//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//
//        savedInstanceState.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) rowListItem);
//        super.onSaveInstanceState(savedInstanceState);
//    }
//    //onRestoreInstanceState
//    @Override
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        rowListItem = savedInstanceState.getParcelableArrayList("data");
//    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_refresh){
            Toast.makeText(MainActivity.this, "Refresh App", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_new){
//            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//            startActivity(intent);
            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public List<ItemObject> getAllItemList(){

        StoryApi story = restAdapter.create(StoryApi.class);

        story.getStory(new Callback<All>() {

            @Override
            public void success(All all, Response response) {

                for (int i = 0; i < all.objects.size(); i++) {
//                    Reads the data into a variable
                    String ti_tle = all.objects.get(i).getTitle();
//                    String pic = R.drawable.canada;
                    String pic = all.objects.get(i).getMedia();
                    String time_stamp = all.objects.get(i).getTimestamp();
                    String loca_tion = all.objects.get(i).getLocation();


//                    Puts the data into another list for cardviews
                    allItems.add(new ItemObject(ti_tle, pic, time_stamp, loca_tion));

//                    allItems.add(new ItemObject(name, num));
                }

            }

            @Override
            public void failure(RetrofitError error) {
                //story_title.setText(error.getMessage());
                Toast.makeText(getApplicationContext(), "Failed to load", Toast.LENGTH_SHORT).show();
            }
        });


        return allItems;
    }

}
