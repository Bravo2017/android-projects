package com.example.tune.sqlitedownload;


import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tune.sqlitedownload.Models.FarmData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    RestClient restClient;
    Database database;
    Spinner house_spinner, bed_spinner;
    private static int DELAY_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restClient = new RestClient();
        database = new Database(this);
        database.getWritableDatabase();
        saveFarmDatatoSQLiteDB();
        // Spinner element
        house_spinner = (Spinner) findViewById(R.id.house_spinner);
        bed_spinner = (Spinner) findViewById(R.id.bed_spinner);

        // Spinner click listener
        house_spinner.setOnItemSelectedListener(this);

        // Loading spinner data from database
        loadHouseSpinnerData();
    }

    private void loadHouseSpinnerData() {
        // database handler
        Database db = new Database(getApplicationContext());

        // Spinner Drop down elements
        List<String> houses = database.getGreenHouses();
        Set<String> hs = new HashSet<>();
        hs.addAll(houses);
        houses.clear();
        houses.addAll(hs);

        //this is for custom spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, houses);

        // Drop down layout style - list view with radio button for default provided by android
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //this for a custom spinner
        dataAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        // attaching data adapter to spinner
        house_spinner.setAdapter(dataAdapter);
    }


    private void saveFarmDatatoSQLiteDB() {
        restClient.getService().getObjectWithNestedArraysAndObject(new Callback<FarmData>() {
            @Override
            public void success(FarmData farmdata, Response response) {

                if(farmdata.data != null && farmdata.data.size() >0)
                {
                    for (int i = 0; i < farmdata.data.size(); i++) {
                        database.insertGreenHouse(farmdata.data.get(i).greenhouseid, farmdata.data.get(i).greenhousename);
                        for(int j=0; j<farmdata.data.get(i).beds.size(); j++)
                        {
                            database.insertGreenBeds(farmdata.data.get(i).beds.get(j).bedid, farmdata.data.get(i).beds.get(j).bedname, farmdata.data.get(i).greenhousename);
                        }
                    }
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // On selecting a spinner item
        final String greenhouse = adapterView.getItemAtPosition(i).toString();
        // database handler
        Database db = new Database(getApplicationContext());

        // Spinner Drop down elements
        List<String> beds = database.getGreenHouseBeds(greenhouse);
        Set<String> bd = new HashSet<>();
        bd.addAll(beds);
        beds.clear();
        beds.addAll(bd);

        //this is for custom spinner
        ArrayAdapter<String> bedAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_bed, beds);

        // Drop down layout style - list view with radio button for default provided by android
        bedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //this for a custom spinner
        bedAdapter.setDropDownViewResource(R.layout.spinner_dropdown_bed);

        // attaching data adapter to spinner
        bed_spinner.setAdapter(bedAdapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
