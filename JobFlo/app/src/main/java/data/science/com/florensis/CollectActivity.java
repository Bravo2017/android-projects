package data.science.com.florensis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.Time;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import data.science.com.florensis.Models.Database;



public class CollectActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Database database;
    Spinner house_spinner, bed_spinner;
    Button recordButton;
    String greenhouse, bedname;
    ListView listView_pest;

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
        Set<String> ps = new HashSet<>();
        ps.addAll(pest);
        pest.clear();
        pest.addAll(ps);
        Collections.sort(pest);

        //this is for custom btnstyle
        listView_pest = (ListView) findViewById(R.id.list);
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
        Collections.sort(houses);

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
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // On selecting a btnstyle item
        final String greenhouse = adapterView.getItemAtPosition(i).toString();

        // Spinner Drop down elements
        List<String> beds = database.getGreenHouseBeds(greenhouse);
        Set<String> bd = new HashSet<>();
        bd.addAll(beds);
        beds.clear();
        beds.addAll(bd);
        Collections.sort(beds);

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
        bedname = bed_spinner.getSelectedItem().toString();

        View v;
        ArrayList<String> editTextData = new ArrayList<String>();
        EditText editText;
        TextView textView;
        for (int i = 0; i < listView_pest.getCount(); i++) {
            editText = (EditText) listView_pest.getChildAt(i).findViewById(R.id.pestid);
            textView = (TextView) listView_pest.getChildAt(i).findViewById(R.id.pestname);
            if (editText!=null) {
                editTextData.add(String.valueOf(editText.getText()));

                /** you can try to log your values EditText */
                String pest_id = database.getPestID(String.valueOf(textView.getText()).trim());
                String bed_id = database.getBedID(bedname, greenhouse);

                String time_stamp = DateFormat.getDateTimeInstance().format(new Date());

                database.insertRecordNames(String.valueOf(textView.getText()).trim(), bedname, greenhouse, String.valueOf(editText.getText()),time_stamp,SplashActivity.sh.getString("userid", null));
                database.insertRecords(pest_id, bed_id, String.valueOf(editText.getText()),time_stamp,SplashActivity.sh.getString("userid", null));
                Toast.makeText(getApplicationContext(), "Record successfully saved", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CollectActivity.this, ViewActivity.class);
                startActivity(intent);
                finish();
            }
        }

//        BackgroundTask backgroundTask = new BackgroundTask(this);
//        backgroundTask.execute("add_info",greenhouse, bedname );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_logged_in, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i = null;

        switch (item.getItemId()) {

            case R.id.action_logout:
                Toast.makeText(getApplicationContext(), "You have successfully logout", Toast.LENGTH_LONG).show();

                SplashActivity.editor.remove("loginTest");
                SplashActivity.editor.commit();

                Intent logout = new Intent(getApplicationContext(), SplashActivity.class);
                startActivity(logout);
                break;

            case R.id.action_about:
                break;
            case R.id.action_help:
                break;
            default:
                // Do nothing
        }

        if(i != null)
            startActivity(i);

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}

