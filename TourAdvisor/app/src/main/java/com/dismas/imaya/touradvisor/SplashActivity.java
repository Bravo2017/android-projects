package com.dismas.imaya.touradvisor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    public static String str_login_test;

    public static SharedPreferences sh;
    public static SharedPreferences.Editor editor;

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // here initializing the shared preference
        sh = getSharedPreferences("myprefe", 0);
        editor = sh.edit();

        // check here if user is login or not
        str_login_test = sh.getString("loginTest", null);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
            return;
        }

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                /*
                 * if user login test is true on oncreate then redirect the user
                 * to result page
                 */

                if (str_login_test != null
                        && !str_login_test.toString().trim().equals("")) {
                    Intent send = new Intent(getApplicationContext(),
                            MainActivityDrawer.class);
                    startActivity(send);
                }
                /*
                 * if user login test is false on oncreate then redirect the
                 * user to registration page
                 */
                else {

                    Intent send = new Intent(getApplicationContext(),
                            Login_RegistrationActivity.class);
                    startActivity(send);

                }
            }

        }, SPLASH_TIME_OUT);


    }
}
