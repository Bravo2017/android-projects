package com.dismas.imaya.customgridview;

import java.util.ArrayList;

import android.content.ClipData;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    GridView gridView;
    ArrayList<ClipData.Item> gridArray = new ArrayList<ClipData.Item>();
    CustomGridViewAdapter customGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set grid view item
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
        Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.personal);

        gridArray.add(new ClipData.Item(homeIcon,"Home"));
        gridArray.add(new ClipData.Item(userIcon,"User"));
        gridArray.add(new ClipData.Item(homeIcon,"House"));
        gridArray.add(new ClipData.Item(userIcon,"Friend"));
        gridArray.add(new ClipData.Item(homeIcon,"Home"));
        gridArray.add(new ClipData.Item(userIcon,"Personal"));
        gridArray.add(new ClipData.Item(homeIcon,"Home"));
        gridArray.add(new ClipData.Item(userIcon,"User"));
        gridArray.add(new ClipData.Item(homeIcon,"Building"));
        gridArray.add(new ClipData.Item(userIcon,"User"));
        gridArray.add(new ClipData.Item(homeIcon,"Home"));
        gridArray.add(new ClipData.Item(userIcon,"xyz"));

        gridView = (GridView) findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
    }

}