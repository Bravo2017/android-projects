package com.dismas.imaya.gatekeeper;

import android.database.Cursor;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.dismas.imaya.gatekeeper.Database.DBhelper;
import com.dismas.imaya.gatekeeper.Database.SQLController;

public class ResultsActivity extends AppCompatActivity {
    private SQLController dbcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //successful
        ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 100);
        toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 20000);
        //end of successful
        // Showing error message that phone is not nfc enabled
        Toast.makeText(this, "Verification is successful",
                Toast.LENGTH_LONG).show();

        String Card_Serial = "147W741E";
        TextView name = (TextView) findViewById(R.id.name);
        TextView designation= (TextView) findViewById(R.id.designation);
        TextView department = (TextView) findViewById(R.id.department);
        TextView imgurl = (TextView) findViewById(R.id.imageurl);
        TextView dob = (TextView) findViewById(R.id.dob);
        TextView height = (TextView) findViewById(R.id.height);
        TextView weight = (TextView) findViewById(R.id.weight);
        TextView allowed_areas = (TextView) findViewById(R.id.allowed_areas);
        TextView card_serial = (TextView) findViewById(R.id.card_serial);
        dbcon = new SQLController(this);
        dbcon.open();
        // Attach The Data From DataBase Into ListView Using Crusor Adapter
        Cursor cursor = dbcon.fetch();
        if(DBhelper.CARD_SERIAL == Card_Serial)
        {
            String nametv=cursor.getString(0); // Here you can get data from table and stored in string if it has only one string.
            name.setText(nametv);
        }
        String[] from = new String[] { DBhelper._ID, DBhelper.NAME,
                DBhelper.DESIGNATION, DBhelper.DEPARTMENT, DBhelper.IMG_URL, DBhelper.DOB,
                DBhelper.HEIGHT, DBhelper.WEIGHT, DBhelper.ALLOWED_AREAS, DBhelper.CARD_SERIAL };
    }

}
