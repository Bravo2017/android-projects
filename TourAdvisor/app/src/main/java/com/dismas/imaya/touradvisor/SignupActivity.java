package com.dismas.imaya.touradvisor;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private static final String REGISTER_URL = "http://touradvisorzone.com/touradvisorphp/register.php";

    public static final String KEY_USERNAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_CITY = "city";
    public static final String KEY_COUNTRY = "country";

    private ProgressDialog loading;

    Button register;
    TextView login;
    String url;
    // Spinner element
    Spinner spinner;

    String label="";

    String str_Name, str_Password, str_RePassword, str_Email, str_City, str_Country, random;

    EditText edt_Name, edt_Password, edt_RePassword, edt_Email, edt_City;

    public static String[] country = new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla",

            "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria",

            "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",

            "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",

            "Brazil", "British Indian Ocean Territory", "British Virgin Islands", "Brunei", "Bulgaria",

            "Burkina Faso", "Burma (Myanmar)", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde",

            "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island",

            "Cocos (Keeling) Islands", "Colombia", "Comoros", "Cook Islands", "Costa Rica",

            "Croatia", "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of the Congo",

            "Denmark", "Djibouti", "Dominica", "Dominican Republic",

            "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia",

            "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Polynesia",

            "Gabon", "Gambia", "Gaza Strip", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece",

            "Greenland", "Grenada", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana",

            "Haiti", "Holy See (Vatican City)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India",

            "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Ivory Coast", "Jamaica",

            "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait",

            "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein",

            "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia",

            "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mayotte", "Mexico",

            "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco",

            "Mozambique", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia",

            "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea",

            "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama",

            "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland",

            "Portugal", "Puerto Rico", "Qatar", "Republic of the Congo", "Romania", "Russia", "Rwanda",

            "Saint Barthelemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin",

            "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino",

            "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone",

            "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea",

            "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland",

            "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tokelau",

            "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands",

            "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "US Virgin Islands", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam",

            "Wallis and Futuna", "West Bank", "Yemen", "Zambia", "Zimbabwe"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);

        register = (Button) findViewById(R.id.signup);
        login = (TextView) findViewById(R.id.login);
        edt_Name = (EditText) findViewById(R.id.txtName);
        edt_Password = (EditText) findViewById(R.id.txtPass);
        edt_RePassword = (EditText) findViewById(R.id.txtCPass);
        edt_City = (EditText) findViewById(R.id.txtCity);
        edt_Email = (EditText) findViewById(R.id.txtEmail);

        SplashActivity.editor.clear();
        SplashActivity.editor.commit();

        // Spinner element
        spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        loadSpinnerData();
        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.login:

                // on login button click send to login activity

                Intent login = new Intent(getApplicationContext(), LoginActivity.class);

                startActivity(login);

                break;
            default:

                str_Name = edt_Name.getText().toString();
                str_Password = edt_Password.getText().toString();
                str_RePassword = edt_RePassword.getText().toString();
                str_City = edt_City.getText().toString();
                str_Country = label;
                str_Email = edt_Email.getText().toString();

                if (str_Name.length() == 0 & str_Password.length() == 0
                        & str_RePassword.length() == 0 & str_City.length() == 0 & str_Country.length() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "All fields are mandatory to fill", Toast.LENGTH_LONG)
                            .show();
                } else if (str_Name.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please enter your Name",
                            Toast.LENGTH_LONG).show();
                } else if (str_Password.length() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Please enter your Password", Toast.LENGTH_LONG).show();
                } else if (str_RePassword.length() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Please Re-enter your Password", Toast.LENGTH_LONG).show();
                }

                else if (str_Email.length() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Please enter your Email Id", Toast.LENGTH_LONG).show();
                }

                else if (str_Password.contains(str_RePassword) != str_RePassword
                        .contains(str_Password)) {
                    Toast.makeText(getApplicationContext(),
                            "Confirm Password does not match", Toast.LENGTH_LONG)
                            .show();
                }
                else if (str_City.length() == 0) {

                    Toast.makeText(getApplicationContext(),
                            "Please enter your City", Toast.LENGTH_LONG)
                            .show();

                }
                else if (str_Country.length() == 0) {

                    Toast.makeText(getApplicationContext(),
                            "Please select your Country", Toast.LENGTH_LONG)
                            .show();

                }

                else {
                    loading = ProgressDialog.show(SignupActivity.this, "Please wait...", "Registering...", false, false);
                    StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
//                                    commit the changes to the shared preferences
                                    loading.dismiss();
                                    SplashActivity.editor.putString("name", str_Name);
                                    SplashActivity.editor.putString("password", str_RePassword);
                                    SplashActivity.editor.putString("email", str_Email);
                                    SplashActivity.editor.putString("city", str_City);
                                    SplashActivity.editor.putString("country", str_Country);

                                    SplashActivity.editor.commit();
//                                     end of the shared preferences
                                    Intent sendtoLogin = new Intent(getApplicationContext(),
                                            LoginActivity.class);
                                    startActivity(sendtoLogin);
                                    Toast.makeText(SignupActivity.this,response,Toast.LENGTH_LONG).show();
                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    Toast.makeText(SignupActivity.this,error.toString(),Toast.LENGTH_LONG).show();
                                }
                            }){
                        @Override
                        protected Map<String,String> getParams(){
                            Map<String,String> params = new HashMap<String, String>();
                            params.put(KEY_USERNAME,str_Name);
                            params.put(KEY_EMAIL, str_Email);
                            params.put(KEY_PASSWORD,str_RePassword);
                            params.put(KEY_CITY,str_City);
                            params.put(KEY_COUNTRY,str_Country);
                            return params;
                        }

                    };

                    RequestQueue requestQueue = Volley.newRequestQueue(this);
                    requestQueue.add(stringRequest);

                }
                break;

        }

    }

    // on back key press exit the application.

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(SignupActivity.this, SplashActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }

    private void loadSpinnerData() {

        ///Spinner start
        ArrayList<String> countries = new ArrayList<String>();
        for( int i=0; i< country.length; i++ ){
            if( country.length > 0 && !countries.contains(country) ){
                countries.add( country[i] );
            }
        }
        Collections.sort(countries);

        //this is for custom spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, countries);

        // Drop down layout style - list view with radio button for default provided by android
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //this for a custom spinner
        dataAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        label = parent.getItemAtPosition(position).toString();
        final Context context = this;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
