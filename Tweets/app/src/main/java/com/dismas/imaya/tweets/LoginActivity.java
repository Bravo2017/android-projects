package com.dismas.imaya.tweets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;

import io.fabric.sdk.android.Fabric;

/**
 * Created by imaya on 4/29/16.
 */
public class LoginActivity extends Activity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "jNq4abA5hqvcVpv26oisehOKg";
    private static final String TWITTER_SECRET = "ysP7wPRYSbFN0kFFrN63MudMV9sZAIZJKs0S3wmI1B0Zmej9Eu ";

    private TwitterLoginButton loginButton;
    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

        setContentView(R.layout.login_activity);

        loginButton = (TwitterLoginButton)findViewById(R.id.twitter_login_button);
        loginButton.setCallback(new LoginHandler());
        status = (TextView)findViewById(R.id.status);
        status.setText("Status: Ready");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        loginButton.onActivityResult(requestCode, resultCode, data);
    }

    private class LoginHandler extends Callback<TwitterSession> {
        @Override
        public void success(Result<TwitterSession> twitterSessionResult) {

            String output = "Status: " +
                    "Your login was successful " +
                    twitterSessionResult.data.getUserName() +
                    "\nAuth Token Received: " +
                    twitterSessionResult.data.getAuthToken().token;

            status.setText(output);

        }

        @Override
        public void failure(TwitterException e) {

            status.setText("Status: Login Failed");

        }
    }
}