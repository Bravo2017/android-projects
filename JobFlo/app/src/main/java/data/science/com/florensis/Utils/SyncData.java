package data.science.com.florensis.Utils;


import org.json.JSONArray;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by imaya on 3/1/17.
 */

public interface SyncData {
    @POST("/")
    void syncDataOnline(@Body JSONArray data, Callback<JSONArray> callback);
}
