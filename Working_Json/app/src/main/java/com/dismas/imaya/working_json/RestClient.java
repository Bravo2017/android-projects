package com.dismas.imaya.working_json;

/**
 * Created by imaya on 4/21/16.
 */
public class RestClient {
    private static final String URL = "http://api.getevrybit.com/";
    private retrofit.RestAdapter restAdapter;
    private EvrybitService evrybitService;

    public RestClient()
    {

        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        evrybitService = restAdapter.create(EvrybitService.class);
    }

    public EvrybitService getService()
    {
        return evrybitService;
    }
}
