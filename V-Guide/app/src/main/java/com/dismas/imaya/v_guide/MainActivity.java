package com.dismas.imaya.v_guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;

import io.fabric.sdk.android.Fabric;

import static android.R.attr.button;
import static android.R.attr.data;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "NCCVgNx70lj0ISqCpT6gq6fMG";
    private static final String TWITTER_SECRET = "n5F3EmDNvyPuxhaxJwfoUUhtxi1zfOpLCnNhv5DoZO1UrWACNi";

    //Tags to send the username and image url to next activity using intent
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PROFILE_IMAGE_URL = "image_url";

    //Twitter Login Button
    TwitterLoginButton twitterLoginButton;
    private TextView status;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

        setContentView(R.layout.activity_main);
        //Initializing twitter login button
        twitterLoginButton = (TwitterLoginButton) findViewById(R.id.twitterLogin);
        twitterLoginButton.setCallback(new LoginHandler());
        status = (TextView)findViewById(R.id.status);
        //Adding callback to the button
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, DrawerActivity.class);
                startActivity(intent);

            }

        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        twitterLoginButton.onActivityResult(requestCode, resultCode, data);
    }

    private class LoginHandler extends Callback<TwitterSession> {
        @Override
        public void success(Result<TwitterSession> twitterSessionResult) {
            //Getting the username from session
            final String username = twitterSessionResult.data.getUserName();
            String profileImage = "https://twitter.com/" + twitterSessionResult.data.getUserName() + "/profile_image?size=original";

            Intent intent = new Intent(getApplicationContext(), DrawerActivity.class);
            //Adding the values to intent
            intent.putExtra(KEY_USERNAME,username);
            intent.putExtra(KEY_PROFILE_IMAGE_URL, profileImage);
            startActivity(intent);

        }

        @Override
        public void failure(TwitterException e) {

            status.setText("Status: Login Failed");

        }
    }

}
