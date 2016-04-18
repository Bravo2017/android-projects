package com.dismas.imaya.retrofit_trial;

import com.google.gson.annotations.Expose;

/**
 * Created by imaya on 4/18/16.
 */
public class User {
    @Expose
    private String login;
    @Expose
    private String avatar_url;
    @Expose
    private String html_url;
    @Expose
    private String name;
    @Expose
    private String email;
    @Expose
    private String public_repos;
    @Expose
    private String public_gists;
    @Expose
    private int followers;
    @Expose
    private int following;

    public String getLogin(){
        return login;
    }
    public String getAvatar(){
        return avatar_url;
    }
    public String getHtml_url(){
        return html_url;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPublicRepos(){
        return public_repos;
    }
    public String getPublicGists(){
        return public_gists;
    }
    public int getFollowers(){
        return followers;
    }
    public int getFollowing(){
        return following;
    }
}
