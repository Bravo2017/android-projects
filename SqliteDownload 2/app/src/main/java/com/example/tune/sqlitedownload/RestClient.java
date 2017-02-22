package com.example.tune.sqlitedownload;

import com.example.tune.sqlitedownload.Utils.FarmService;

/**
 * Created by imaya on 2/21/17.
 */

public class RestClient {
    private static final String URL = "http://104.236.78.39/touradvisorphp/";
    private retrofit.RestAdapter restAdapter;
    private FarmService farmService;

    public RestClient()
    {

        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        farmService = restAdapter.create(FarmService.class);
    }

    public FarmService getService()
    {
        return farmService;
    }
}
