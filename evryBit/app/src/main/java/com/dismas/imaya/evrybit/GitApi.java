package com.dismas.imaya.evrybit;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by imaya on 4/19/16.
 */
public interface GitApi {
    @GET("/evrybit/api/v2/story/")      //here is the other url part for the API
    public void getFeed(Callback<List<GitModel>> response);

}
