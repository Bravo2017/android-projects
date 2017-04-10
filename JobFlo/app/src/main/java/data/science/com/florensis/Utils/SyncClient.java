package data.science.com.florensis.Utils;

import data.science.com.florensis.SplashActivity;

/**
 * Created by imaya on 3/1/17.
 */

public class SyncClient {
    private static String str_getUserId = SplashActivity.sh.getString("userid", null);
    private static final String URL = "http://datascience.co.ke/florensis_v2/mobile_forms.php?p="+str_getUserId;
    private retrofit.RestAdapter restAdapter;
    private SyncData syncData;


    public SyncClient()
    {

        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        syncData = restAdapter.create(SyncData.class);
    }

    public SyncData getService()
    {
        return syncData;
    }


}

