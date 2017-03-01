package data.science.com.florensis.Utils;

import android.util.Log;

import data.science.com.florensis.Models.PestData;
import data.science.com.florensis.SplashActivity;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 2/27/17.
 */

public interface PestService {
    String str_getUserId = SplashActivity.sh.getString("userid", null);
    @GET("/")
    public void getPests(Callback<PestData> pestdata);
}
