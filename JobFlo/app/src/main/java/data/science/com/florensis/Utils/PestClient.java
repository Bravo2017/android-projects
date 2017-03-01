package data.science.com.florensis.Utils;

import android.util.Log;

import data.science.com.florensis.SplashActivity;

/**
 * Created by imaya on 2/27/17.
 */

public class PestClient {
    private static String str_getUserId = SplashActivity.sh.getString("userid", null);
    private static final String PEST_URL = "http://datascience.co.ke/florensis_v2/php_action/jsonb/pm_retrieve.php?p="+str_getUserId;
    private retrofit.RestAdapter pestAdapter;
    private PestService pestService;


    public PestClient()
    {
        Log.e("USERID", "Imaya"+str_getUserId);
        pestAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(PEST_URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        pestService = pestAdapter.create(PestService.class);
    }

    public PestService getService()
    {
        return pestService;
    }
}
