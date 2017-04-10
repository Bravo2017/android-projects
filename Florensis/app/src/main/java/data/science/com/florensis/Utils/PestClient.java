package data.science.com.florensis.Utils;

/**
 * Created by imaya on 2/27/17.
 */

public class PestClient {
    private static final String PEST_URL = "http://datascience.co.ke/";
    private retrofit.RestAdapter pestAdapter;
    private PestService pestService;


    public PestClient()
    {

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
