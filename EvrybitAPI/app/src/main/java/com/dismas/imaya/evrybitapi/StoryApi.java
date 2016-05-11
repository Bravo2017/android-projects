package com.dismas.imaya.evrybitapi;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by imaya on 5/11/16.
 */
public interface StoryApi {
    @GET("/evrybit/api/v2/story/")      //here is the other url part for the API
    public void getFeed(Callback<List<StoryModel>> response);
}
