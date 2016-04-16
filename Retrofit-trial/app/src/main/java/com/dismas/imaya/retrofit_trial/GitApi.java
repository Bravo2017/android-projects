package com.dismas.imaya.retrofit_trial;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 4/16/16.
 */
public interface GitApi {
    @GET("/repositories")      //here is the other url part for the API
    public void getFeed(Callback<List<GitModel>> response);
}
