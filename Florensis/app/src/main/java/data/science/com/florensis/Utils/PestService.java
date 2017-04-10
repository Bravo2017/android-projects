package data.science.com.florensis.Utils;

import data.science.com.florensis.Models.PestData;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 2/27/17.
 */

public interface PestService {
    @GET("/florensis_v2/php_action/jsonb/pm_retrieve.php?p=5")
    public void getPests(Callback<PestData> pestdata);
}
