package com.dismas.imaya.soundcplayer;

import retrofit.RestAdapter;

/**
 * Created by imaya on 3/12/16.
 */
public class SoundCloud {
    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private static final SCService SERVICE = REST_ADAPTER.create(SCService.class);

    public static SCService getService() {
        return SERVICE;
    }

}
