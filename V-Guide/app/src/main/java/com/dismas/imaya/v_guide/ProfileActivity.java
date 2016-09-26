package com.dismas.imaya.v_guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by imaya on 9/21/16.
 */
public class ProfileActivity extends AppCompatActivity {
    //Image Loader object
    private ImageLoader imageLoader;

    //NetworkImageView Ojbect
    private NetworkImageView profileImage;

    //TextView object
    private TextView textViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        //Initializing views
//        profileImage = (NetworkImageView) findViewById(R.id.profileImage);
//        textViewUsername = (TextView) findViewById(R.id.textViewUsername);
//
//        //Getting the intent
//        Intent intent = getIntent();
//
//        //Getting values from intent
//        String username = intent.getStringExtra(MainActivity.KEY_USERNAME);
//        String profileImageUrl = intent.getStringExtra(MainActivity.KEY_PROFILE_IMAGE_URL);
//
//        //Loading image
//        imageLoader = CustomVolleyRequest.getInstance(this).getImageLoader();
//        imageLoader.get(profileImageUrl, ImageLoader.getImageListener(profileImage, R.mipmap.ic_launcher, android.R.drawable.ic_dialog_alert));
//        profileImage.setImageUrl(profileImageUrl, imageLoader);
//
//        //Setting the username in textview
//        textViewUsername.setText("@"+username);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(ProfileActivity.this, DrawerActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}
