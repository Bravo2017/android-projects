package com.dismas.imaya.touradvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    Button register;
    TextView login;
    String url;

    String str_Name, str_Password, str_RePassword, str_Email, str_City, str_Country,
            random;

    EditText edt_Name, edt_Password, edt_RePassword, edt_Email, edt_City, edt_Country;

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
        edt_Country = (EditText) findViewById(R.id.txtCountry);
        edt_Email = (EditText) findViewById(R.id.txtEmail);

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
        }

        str_Name = edt_Name.getText().toString();
        str_Password = edt_Password.getText().toString();
        str_RePassword = edt_RePassword.getText().toString();
        str_City = edt_City.getText().toString();
        str_Country = edt_Country.getText().toString();
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
                    "Please enter your Country", Toast.LENGTH_LONG)
                    .show();

        }

        else {
            SplashActivity.editor.putString("name", str_Name);
            SplashActivity.editor.putString("password", str_RePassword);
            SplashActivity.editor.putString("email", str_Email);
            SplashActivity.editor.putString("city", str_City);
            SplashActivity.editor.putString("country", str_Country);

            SplashActivity.editor.commit();

            Intent sendtoLogin = new Intent(getApplicationContext(),
                    SplashActivity.class);

            Toast.makeText(getApplicationContext(),
                    "You have successfully registered", Toast.LENGTH_LONG)
                    .show();

            startActivity(sendtoLogin);

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

}
