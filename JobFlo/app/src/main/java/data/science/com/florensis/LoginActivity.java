package data.science.com.florensis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import data.science.com.florensis.Models.Database;
import data.science.com.florensis.Models.FarmData;
import data.science.com.florensis.Models.PestData;
import data.science.com.florensis.Utils.PestClient;
import data.science.com.florensis.Utils.RestClient;
import retrofit.Callback;
import retrofit.RetrofitError;


public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private RequestQueue requestQueue;
    private static final String URL_LOGIN = "http://datascience.co.ke/florensis_v2/mobile_login.php";
    private StringRequest request;
    private Button btn_login;
    RestClient restClient;
    PestClient pestClient;
    Database database;
    String user_name, pass_word;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        database = new Database(this);
        database.getWritableDatabase();

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.btn_login);

        requestQueue = Volley.newRequestQueue(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_name = username.getText().toString();
                pass_word = password.getText().toString();
                request = new StringRequest(Request.Method.POST, URL_LOGIN, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response); //create a json object with response as the parameter.
//
                            if(jsonObject.getString("success") == "true"){
                                Toast.makeText(getApplicationContext(),jsonObject.getString("messages"),Toast.LENGTH_SHORT).show();
                                String user_id  = jsonObject.getString("userid");

                                SplashActivity.editor.putString("username", user_name);
                                SplashActivity.editor.putString("password", pass_word);
                                SplashActivity.editor.putString("userid", user_id);
                                SplashActivity.editor.putString("loginTest", "true");
                                SplashActivity.editor.commit();
                                restClient = new RestClient();
                                pestClient = new PestClient();

                                saveFarmDatatoSQLiteDB();
                                savePestDatatoSQLiteDB();
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                            else{
                                Toast.makeText(getApplicationContext(),jsonObject.getString("messages"),Toast.LENGTH_SHORT).show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },new Response.ErrorListener(){

                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put("username",username.getText().toString());
                        hashMap.put("password",password.getText().toString());
                        return hashMap;
                    }
                };

                requestQueue.add(request);
            }
        });


    }

    private void savePestDatatoSQLiteDB() {
        pestClient.getService().getPests(new Callback<PestData>() {
            @Override
            public void success(PestData pestdata, retrofit.client.Response response) {
                if(pestdata.data != null && pestdata.data.size() >0)
                {
                    for (int i = 0; i < pestdata.data.size(); i++) {
                        database.insertPest(pestdata.data.get(i).pestid, pestdata.data.get(i).pestname);
                    }
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(LoginActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void saveFarmDatatoSQLiteDB() {
        restClient.getService().getObjectWithNestedArraysAndObject(new Callback<FarmData>() {
            @Override
            public void success(FarmData farmdata, retrofit.client.Response response) {
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
                Toast.makeText(LoginActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(LoginActivity.this, SplashActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}
