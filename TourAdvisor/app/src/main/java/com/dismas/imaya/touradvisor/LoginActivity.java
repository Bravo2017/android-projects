package com.dismas.imaya.touradvisor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    String str_UserEmail, str_Password, str_getEmail, str_getPass;

    EditText edt_UEmail, edt_Password;

    Button login;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /* fetching the data from shared preference in order to make user login */
        /* data are saved in application through SplashActivity */
        /* only name and password is sufficient to make login */

        str_getEmail = SplashActivity.sh.getString("email", null);
        str_getPass = SplashActivity.sh.getString("password", null);
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
        }

        else if (str_getEmail.matches("") && str_getPass.matches("")) {
            Toast.makeText(getApplicationContext(),
                    "Details does not belongs to any account",
                    Toast.LENGTH_LONG).show();
        }

        else if (!(str_UserEmail.matches(str_getEmail))) {
            Toast.makeText(getApplicationContext(),
                    "Either login/password is incorrect", Toast.LENGTH_LONG)
                    .show();
        }

        else if (!(str_getPass.matches(str_Password))) {
            Toast.makeText(getApplicationContext(),
                    "Either login/password is incorrect", Toast.LENGTH_LONG)
                    .show();
        }

        else if ((str_getEmail.matches(str_UserEmail))
                && (str_getPass.matches(str_Password))) {

            /*
             * dont forget to commit after doing the operation with shared
             * preference
             */
            /* without commit data will not saved to shared preference */
            SplashActivity.editor.putString("loginTest", "true");
            SplashActivity.editor.commit();

            Toast.makeText(getApplicationContext(),
                    "You have successfuly login", Toast.LENGTH_LONG).show();

            Intent sendToLogout = new Intent(getApplicationContext(),
                    MainActivity.class);

            startActivity(sendToLogout);
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
