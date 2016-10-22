package com.dismas.imaya.gatekeeper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.dismas.imaya.gatekeeper.Database.DBhelper;
import com.dismas.imaya.gatekeeper.Database.SQLController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button button;
    // Spinner element
    Spinner spinner;
    private SQLController dbController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonExit();

        dbController = new SQLController(this);
        dbController.open();


        //insert data into sqlite database
        dbController.insert("O'Neill, Jack", "Colonel", "SGC General", "android.resource://com.dismas.imaya.gatekeeper/drawable/jackoneill", "21/02/1949", "5.7", "78KG", "Gate A", "44553A9A");
        dbController.insert("George S. Hammond", "SGC Major General", "Commander-in-Chief", "android.resource://com.dismas.imaya.gatekeeper/drawable/georgehammond", "09/12/1959", "6.3", "85KG", "Gate B", "E14351D5");
        dbController.insert("Samantha Carter", "Captain", "SGC Commander of the Daedalus-class ship", "android.resource://com.dismas.imaya.gatekeeper/drawable/samanthacarter", "12/02/1960", "5.5", "60KG", "Gate B", "D47C379A");
        dbController.insert("Cameron Mitchell", "Colonel", "Stargate Command", "android.resource://com.dismas.imaya.gatekeeper/drawable/cameronmitchel", "11/12/1970", "5.6", "78KG", "Data Centre", "445E369A");
        dbController.insert("Ann Siyanoi", "Captian", "Cadet", "img_url", "21/02/1989", "6.0", "80KG", "Conference", "654U455P");
        dbController.insert("Christiana Mandy", "Officer Cadet", "Cadet", "img_url", "21/10/1969", "5.9", "70KG", "Data Centre", "987G789V");
        dbController.insert("Olive Wanjiku", "Commandant", "Cadet", "img_url", "03/11/1989", "6.1", "73KG", "Gate B", "357X753V");
        dbController.insert("Job Maroro", "Marshal", "Field", "img_url", "21/02/1990", "5.7", "70KG", "Gate A", "159S951K");
        dbController.insert("Anthony Kamau", "Officer Cadet", "Health", "img_url", "21/04/1991", "5.8", "78KG", "Conference", "254Z451M");
        dbController.insert("Maryann Nashipai", "Officer Cadet", "Store", "img_url", "21/02/1989", "6.0", "72KG", "Gate A", "014J123G");
        // Spinner element
        spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Loading spinner data from database
        loadSpinnerData();
    }
    public void addListenerOnButtonExit() {

        final Context context = this;

        button = (Button) findViewById(R.id.exit);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }

        });

    }

    /**
     * Function to load the spinner data from SQLite database
     * */
    private void loadSpinnerData() {
        // database handler
        DBhelper db = new DBhelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> lables = db.getAllAreas();
        Set<String> hs = new HashSet<>();
        hs.addAll(lables);
        lables.clear();
        lables.addAll(hs);

        //this is for custom spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, lables);

        // Drop down layout style - list view with radio button for default provided by android
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //this for a custom spinner
        dataAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        final String label = parent.getItemAtPosition(position).toString();
        final Context context = this;

        button = (Button) findViewById(R.id.verify);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, VerifyActivity.class);
                intent.putExtra("label", label);
                startActivity(intent);
                //finish();

            }

        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
