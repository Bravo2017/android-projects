package data.science.com.florensis.Utils;

import data.science.com.florensis.Models.FarmData;
import retrofit.Callback;
import retrofit.http.GET;

public interface FarmService {
    @GET("/")
    public void getObjectWithNestedArraysAndObject(Callback<FarmData> farmdata);
}
