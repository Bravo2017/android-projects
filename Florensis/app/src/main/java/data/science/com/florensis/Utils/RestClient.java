package data.science.com.florensis.Utils;
public class RestClient {
    private static final String URL = "http://datascience.co.ke/";
    private static final String PEST_URL = "http://datascience.co.ke/florensis_v2/php_action/jsonb/pm_retrieve.php?p=5";
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
