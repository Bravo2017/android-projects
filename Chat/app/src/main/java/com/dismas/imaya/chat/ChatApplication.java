package com.dismas.imaya.chat;

import com.firebase.client.Firebase;

/**
 * Created by imaya on 3/30/16.
 */
public class ChatApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}