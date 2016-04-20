package com.dismas.imaya.trial_retrofit;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by imaya on 4/20/16.
 */
public interface StackOverflowAPI {
    @GET("/evrybit/api/v2/story/")
    Call<StackOverflowQuestions> loadQuestions();
}