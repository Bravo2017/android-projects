package com.dismas.imaya.understand_retrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by imaya on 4/10/16.
 */
public interface GitHubClient {
    @GET("/repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> contributors(
            @Path("owner") String owner,
            @Path("repo") String repo
    );
}
