package com.example.tune.florensiscombined;

import com.example.tune.florensiscombined.Utils.FarmService;

//http://104.236.78.39/touradvisorphp/
public class RestClient {
    private static final String URL = "http://www.mocky.io/v2/58a2ffeb29000093003e48b4";
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
