package data.science.com.florensis.Utils;

import data.science.com.florensis.Models.FarmData;
import retrofit.Callback;
import retrofit.http.GET;

public interface FarmService {
    @GET("/florensis_v2/php_action/jsonb/greenhouse_bed.php?p=5")
    public void getObjectWithNestedArraysAndObject(Callback<FarmData> farmdata);
}
