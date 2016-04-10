package com.dismas.imaya.understand_retrofit;


import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by imaya on 4/10/16.
 */
public final class SimpleService {
    public static final String API_URL = "https://api.github.com";

    public class Contributor {
        String login;
        int contributions;

        public Contributor(String login, int contributions) {
            this.login = login;
            this.contributions = contributions;
        }
    }

    public interface GitHubClient {
        @GET("/repos/{owner}/{repo}/contributors")
        Call<List<Contributor>> contributors(
                @Path("owner") String owner,
                @Path("repo") String repo
        );
    }

    public static void main(String... args) throws IOException{
        // Create a very simple REST adapter which points the GitHub API endpoint.
        GitHubClient client = ServiceGenerator.createService(GitHubClient.class);

        // Create a call instance for looking up Retrofit contributors.
        Call<List<Contributor>> call = client.contributors("fs_opensource", "android-boilerplate");

        // Fetch and print a list of the contributors to the library.
        List<Contributor> contributors = call.execute().body();
        for (Contributor contributor : contributors) {
            System.out.println(
                    contributor.login + " (" + contributor.contributions + ")");
        }
    }
}
