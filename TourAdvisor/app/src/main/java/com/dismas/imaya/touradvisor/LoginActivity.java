package com.dismas.imaya.touradvisor;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import com.dismas.imaya.touradvisor.constructors.ParksAllConstructor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String LOGIN_URL = "http://touradvisorzone.com/touradvisorphp/login.php";
    public static final String LOGIN_URL1 = "http://touradvisorzone.com/touradvisorphp/login_direct.php";

    public static final String KEY_EMAIL="username";
    public static final String KEY_PASSWORD="password";

    private ProgressDialog loading;

    String str_UserEmail, str_Password, str_getEmail, str_getPass;
    String str_Name, str_RePassword, str_Email, str_City, str_Country;

    EditText edt_UEmail, edt_Password;

    Button login;
    ArrayList<ParksAllConstructor> users = new ArrayList<>();

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.signup);
        edt_UEmail = (EditText) findViewById(R.id.txtLogEmail);
        edt_Password = (EditText) findViewById(R.id.txtLogPass);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        str_UserEmail = edt_UEmail.getText().toString();
        str_Password = edt_Password.getText().toString();
//        File f = new File("/data/data/com.dismas.imaya.touradvisor/shared_prefs/myprefe.xml");
        if (SplashActivity.sh.contains("password")){
            /* fetching the data from shared preference in order to make user login */
            /* data are saved in application through SplashActivity */
            /* only name and password is sufficient to make login */

            str_getEmail = SplashActivity.sh.getString("email", null);
            str_getPass = SplashActivity.sh.getString("password", null);
            /* make edittext condition for empty, input etc match */

            if (str_UserEmail.length() == 0 & str_Password.length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Please enter your login User Name and Password",
                        Toast.LENGTH_LONG).show();
            } else if (str_UserEmail.length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Please enter your User Name", Toast.LENGTH_LONG).show();
            } else if (str_Password.length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Please enter your Password", Toast.LENGTH_LONG).show();
            } else if (str_getEmail.matches("") && str_getPass.matches("")) {
                Toast.makeText(getApplicationContext(),
                        "Details does not belongs to any account",
                        Toast.LENGTH_LONG).show();
            } else if (!(str_UserEmail.matches(str_getEmail))) {
                Toast.makeText(getApplicationContext(),
                        "Either login/password is incorrect", Toast.LENGTH_LONG)
                        .show();
            } else if (!(str_getPass.matches(str_Password))) {
                Toast.makeText(getApplicationContext(),
                        "Either login/password is incorrect", Toast.LENGTH_LONG)
                        .show();
            } else if ((str_getEmail.matches(str_UserEmail))
                    && (str_getPass.matches(str_Password))) {

                /*
                 * dont forget to commit after doing the operation with shared
                 * preference
                 */
                /* without commit data will not saved to shared preference */
                loading = ProgressDialog.show(LoginActivity.this, "Please wait...", "login...", false, false);
                StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                if (response.trim().equals("You have successfuly login")) {
                                    loading.dismiss();
                                    SplashActivity.editor.putString("loginTest", "true");
                                    SplashActivity.editor.commit();

                                    Intent sendToLogout = new Intent(getApplicationContext(),
                                            MainActivityDrawer.class);
                                    startActivity(sendToLogout);

                                } else {
                                    Toast.makeText(LoginActivity.this, response, Toast.LENGTH_LONG).show();
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> map = new HashMap<String, String>();
                        map.put(KEY_EMAIL, str_UserEmail);
                        map.put(KEY_PASSWORD, str_Password);
                        return map;
                    }
                };

                RequestQueue requestQueue = Volley.newRequestQueue(this);
                requestQueue.add(stringRequest);
            }
        } else {

            if (str_UserEmail.length() == 0 & str_Password.length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Please enter your login User Name and Password",
                        Toast.LENGTH_LONG).show();
            } else if (str_UserEmail.length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Please enter your User Name", Toast.LENGTH_LONG).show();
            } else if (str_Password.length() == 0) {
                Toast.makeText(getApplicationContext(),
                        "Please enter your Password", Toast.LENGTH_LONG).show();
            } else {
                loading = ProgressDialog.show(LoginActivity.this, "Please wait...", "login...", false, false);
                StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                loading.dismiss();
                                SplashActivity.editor.putString("password", str_Password);
                                SplashActivity.editor.putString("email", str_UserEmail);
                                SplashActivity.editor.putString("loginTest", "true");
                                SplashActivity.editor.commit();

                                Toast.makeText(getApplicationContext(),
                                        response, Toast.LENGTH_LONG).show();
                                Intent sendToLogout = new Intent(getApplicationContext(),
                                        MainActivityDrawer.class);
                                startActivity(sendToLogout);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(LoginActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> map = new HashMap<String, String>();
                        map.put(KEY_EMAIL, str_UserEmail);
                        map.put(KEY_PASSWORD, str_Password);
                        return map;
                    }
                };

                RequestQueue requestQueue = Volley.newRequestQueue(this);
                requestQueue.add(stringRequest);
            }

        }
    }
    private void showJSON(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("userdetails");


            for (int i = 0; i < result.length(); i++) {

                JSONObject userData = result.getJSONObject(i);
                ParksAllConstructor user = new ParksAllConstructor();
                //park.setAttraction_site_id(userData.getInt("attraction_site_id"));
                user.setName(userData.getString("name"));
                user.setUsername(userData.getString("username"));
                user.setEmail(userData.getString("email"));
                user.setPassword(userData.getString("password"));
                user.setCity(userData.getString("city"));
                user.setCountry(userData.getString("country"));
                users.add(user);


            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }



    // on back key press exit the application.

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
