package com.dismas.imaya.smart_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

import studios.codelight.smartloginlibrary.SmartLoginBuilder;
import studios.codelight.smartloginlibrary.SmartLoginConfig;
import studios.codelight.smartloginlibrary.users.SmartFacebookUser;
import studios.codelight.smartloginlibrary.users.SmartGoogleUser;
import studios.codelight.smartloginlibrary.users.SmartUser;

/**
 * Created by imaya on 3/10/16.
 */
public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SmartLoginBuilder loginBuilder = new SmartLoginBuilder();
        Intent intent = loginBuilder.with(LoginActivity.this)
//                .setAppLogo(APP_LOGO)
                .isFacebookLoginEnabled(true).withFacebookAppId("APP_ID")
                .withFacebookPermissions((ArrayList<String>) Arrays.asList("public_profile"))
                .isGoogleLoginEnabled(true)
                .build();
        startActivityForResult(intent, SmartLoginConfig.LOGIN_REQUEST);
        //setContentView(R.layout.main);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //Intent "data" contains the user object
        if(resultCode == SmartLoginConfig.FACEBOOK_LOGIN_REQUEST){
            SmartFacebookUser user;
            try {
                user = data.getParcelableExtra(SmartLoginConfig.USER);
                //use this user object as per your requirement
            }catch (Exception e){
                Log.e(getClass().getSimpleName(), e.getMessage());
            }
        }else if(resultCode == SmartLoginConfig.GOOGLE_LOGIN_REQUEST){
            SmartGoogleUser user;
            try {
                user = data.getParcelableExtra(SmartLoginConfig.USER);
                //use this user object as per your requirement
            }catch (Exception e){
                Log.e(getClass().getSimpleName(), e.getMessage());
            }
        }else if(resultCode == SmartLoginConfig.CUSTOM_LOGIN_REQUEST){
            SmartUser user = data.getParcelableExtra(SmartLoginConfig.USER);
            //use this user object as per your requirement
        }else if(resultCode == RESULT_CANCELED){
            //Login Failed
        }
    }
}