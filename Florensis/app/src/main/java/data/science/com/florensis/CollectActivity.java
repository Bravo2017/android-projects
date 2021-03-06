package data.science.com.florensis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import data.science.com.florensis.Models.Database;



public class CollectActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Database database;
    Spinner house_spinner, bed_spinner;
    Button recordButton;
    ArrayList arrayList;
    ListView listView;
    EditText pest;
    String greenhouse, bedId;
//    ListAdapter adapter;
    private String[] values =
            new String[]{"No of Thrips","No of White fly","No of Black fly"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);

        database = new Database(this);
        database.getWritableDatabase();
        // Spinner element
        house_spinner = (Spinner) findViewById(R.id.house_spinner);
        bed_spinner = (Spinner) findViewById(R.id.bed_spinner);



        // Spinner click listener
        house_spinner.setOnItemSelectedListener(this);

        // Loading btnstyle data from database
        loadHouseSpinnerData();
        loadList();
        recordButton = (Button) findViewById(R.id.record);
    }
    private void loadList() {
        // Spinner Drop down elements
        List<String> pest = database.getPest();
        Log.e("PEST", String.valueOf(pest));
        Set<String> ps = new HashSet<>();
        ps.addAll(pest);
        pest.clear();
        pest.addAll(ps);

        //this is for custom btnstyle
        ListView listView_pest = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> pestAdapter = new ArrayAdapter<String>(this,
                R.layout.listview_list, R.id.pestname,pest);
        listView_pest.setAdapter(pestAdapter);
    }
    private void loadHouseSpinnerData() {

        // Spinner Drop down elements
        List<String> houses = database.getGreenHouses();
        Set<String> hs = new HashSet<>();
        hs.addAll(houses);
        houses.clear();
        houses.addAll(hs);

        //this is for custom btnstyle
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, houses);

        // Drop down layout style - list view with radio button for default provided by android
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //this for a custom btnstyle
        dataAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        // attaching data adapter to btnstyle
        house_spinner.setAdapter(dataAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // On selecting a btnstyle item
        final String greenhouse = adapterView.getItemAtPosition(i).toString();

        // Spinner Drop down elements
        List<String> beds = database.getGreenHouseBeds(greenhouse);
        Set<String> bd = new HashSet<>();
        bd.addAll(beds);
        beds.clear();
        beds.addAll(bd);

        //this is for custom btnstyle
        ArrayAdapter<String> bedAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_bed, beds);

        // Drop down layout style - list view with radio button for default provided by android
        bedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //this for a custom btnstyle
        bedAdapter.setDropDownViewResource(R.layout.spinner_dropdown_bed);

        // attaching data adapter to btnstyle
        bed_spinner.setAdapter(bedAdapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void saveData(View view){
        greenhouse = house_spinner.getSelectedItem().toString();
        bedId = bed_spinner.getSelectedItem().toString();

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute("add_info",greenhouse, bedId );
    }
}

