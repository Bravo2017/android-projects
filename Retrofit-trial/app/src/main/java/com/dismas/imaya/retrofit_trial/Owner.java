package com.dismas.imaya.retrofit_trial;

import com.google.gson.annotations.Expose;

/**
 * Created by imaya on 4/16/16.
 */
public class Owner {
    @Expose
    private String login;
    @Expose
    private String avatar_url;

    @Expose
    private String html_url;

    public String getLogin() {
        return this.login;
    }

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }
}
