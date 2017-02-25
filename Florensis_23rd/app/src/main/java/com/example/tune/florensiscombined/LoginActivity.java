package com.example.tune.florensiscombined;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import com.example.tune.florensiscombined.Models.FarmData;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import retrofit.Callback;
import retrofit.RetrofitError;


public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private RequestQueue requestQueue;
    private static final String URL_LOGIN = "http://datascience.co.ke/florensis_v2/mobile_login.php";
    private StringRequest request;
    private Button btn_login;
    RestClient restClient;
    Database database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        restClient = new RestClient();
        database = new Database(this);
        database.getWritableDatabase();
        saveFarmDatatoSQLiteDB();

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.btn_login);

        requestQueue = Volley.newRequestQueue(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request = new StringRequest(Request.Method.POST, URL_LOGIN, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response); //create a json object with response as the parameter.
//
                            if(jsonObject.getString("success") == "true"){
//                                Toast.makeText(getApplicationContext(),jsonObject.getString("messages"),Toast.LENGTH_SHORT).show();
//                                startActivity(new Intent(getApplicationContext(),MainActivity.class));

                                //                                shared preference save
                                SharedPreferences preferences = getSharedPreferences("MYPREFS",MODE_PRIVATE);
                                String newUser  = jsonObject.getString("userid");
                                SharedPreferences.Editor editor = preferences.edit();
                                editor.putString(newUser,newUser);
                                editor.commit();

                                editor.putString(newUser + "data", newUser);
                                editor.commit();

                                String userDetails = preferences.getString(newUser +  "data","No information on that user.");
                                editor.putString("display",userDetails);
                                editor.commit();
                                Intent displayScreen = new Intent(LoginActivity.this, DisplayScreen.class);
                                startActivity(displayScreen);
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
                Toast.makeText(LoginActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
