package com.dismas.imaya.evrybit;

import com.google.gson.annotations.Expose;

/**
 * Created by imaya on 4/19/16.
 */
public class Owner {
    @Expose
    private String login;
    @Expose
    private String avatar_url;


    public String getLogin() {
        return this.login;
    }
    public String getAvatar_url() {
        return this.avatar_url;
    }

}
