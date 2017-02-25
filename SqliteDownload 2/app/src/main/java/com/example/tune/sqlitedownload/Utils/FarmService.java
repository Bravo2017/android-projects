package com.example.tune.sqlitedownload.Utils;

import com.example.tune.sqlitedownload.Models.FarmData;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 2/21/17.
 */
public interface FarmService {
    @GET("/farm_data.txt")
    public void getObjectWithNestedArraysAndObject(Callback<FarmData> farmdata);
}
