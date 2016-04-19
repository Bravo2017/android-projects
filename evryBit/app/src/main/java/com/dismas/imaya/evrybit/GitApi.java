package com.dismas.imaya.evrybit;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 4/19/16.
 */
public class GitApi {
    @GET("/repositories")      //here is the other url part for the API
    public void getFeed(Callback<List<GitModel>> response) {

    }
}
