package data.science.com.florensis;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;

import data.science.com.florensis.Models.Database;
import data.science.com.florensis.Utils.SyncClient;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ViewActivity extends AppCompatActivity {

    private TextView b_name,g_name, t_time, p_name, v_name;
    private Button btnSync;
    SyncClient syncClient;

    String greenhouse, bed;
    Database database;
    ListView record_list;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_records);
        database = new Database(this);
        database.getWritableDatabase();

        g_name = (TextView) findViewById(R.id.g_name);
        b_name = (TextView) findViewById(R.id.b_name);
        t_time = (TextView) findViewById(R.id.t_time);
        p_name = (TextView) findViewById(R.id.p_name);
        v_name = (TextView) findViewById(R.id.v_name);
        record_list = (ListView) findViewById(R.id.display_listview);
        btnSync = (Button)findViewById(R.id.btnSync);

        String[] from = { "greenhouse","bedname","time_stamp","pestname","value" };
        int[] to = { R.id.g_name, R.id.b_name, R.id.t_time, R.id.p_name, R.id.v_name };
        cursor = database.queryAll();
        SimpleCursorAdapter cursorAdapter = new SimpleCursorAdapter(this,
                R.layout.activity_view, cursor, from, to);
        record_list.setAdapter(cursorAdapter);

//        BackgroundTask backgroundTask = new BackgroundTask(this);
//        backgroundTask.execute("get_info");
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

    protected void userSync(View view){
        syncClient = new SyncClient();

        Callback<JSONArray> callBackRegistraPagador = new Callback<JSONArray>(){
            public void success(JSONArray object, Response response){
                Log.v("Successful", String.valueOf(response));
                Toast.makeText(getApplicationContext(), "Sync Successful", Toast.LENGTH_LONG).show();
                database.emptyTables();
                Intent intent = new Intent(ViewActivity.this, ViewActivity.class);
                startActivity(intent);
                finish();
            }

            public void failure(RetrofitError retrofitError){
                Log.v("Failed", String.valueOf(retrofitError));
                Toast.makeText(getApplicationContext(), "Sync Failed", Toast.LENGTH_LONG).show();
            }
        };
        syncClient.getService().syncDataOnline(database.getSavedRecords(), callBackRegistraPagador);

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }


}