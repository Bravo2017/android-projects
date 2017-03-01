package data.science.com.florensis.Utils;

import data.science.com.florensis.SplashActivity;

public class RestClient {
    private static String str_getUserId = SplashActivity.sh.getString("userid", null);
    private static final String URL = "http://datascience.co.ke/florensis_v2/php_action/jsonb/greenhouse_bed.php?p="+str_getUserId;
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
