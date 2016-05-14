package com.dismas.imaya.combapiadapter;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.dismas.imaya.combapiadapter.Adapter.All;
import com.dismas.imaya.combapiadapter.Adapter.ItemObject;
import com.dismas.imaya.combapiadapter.Adapter.RecyclerViewAdapter;
import com.dismas.imaya.combapiadapter.Adapter.StoryApi;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ActionBarActivity {

    private LinearLayoutManager lLayout;
    String API = "http://52.37.33.186/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(null);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setLogo(R.drawable.logo);
        topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(MainActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

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
            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){

        final List<ItemObject> allItems = new ArrayList<ItemObject>();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();

        final StoryApi story = restAdapter.create(StoryApi.class);

        story.getStory(new Callback<All>() {

            @Override
            public void success(All all, Response response) {


                for (int i = 0; i < 100; i++) {
                    String name = all.objects.get(i).getTitle();
//                    int num = R.drawable.canada;
                    String pic = all.objects.get(i).getMedia();

                    allItems.add(new ItemObject(name, pic));

//                    allItems.add(new ItemObject(name, num));
                }

            }

            @Override
            public void failure(RetrofitError error) {
                //story_title.setText(error.getMessage());
            }
        });


        return allItems;
    }

}
