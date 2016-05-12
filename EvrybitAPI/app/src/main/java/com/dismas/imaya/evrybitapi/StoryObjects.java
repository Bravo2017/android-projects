package com.dismas.imaya.evrybitapi;

import com.google.gson.annotations.Expose;

/**
 * Created by imaya on 5/11/16.
 */
public class StoryObjects {
    @Expose
    private String title;
    @Expose
    private String user_id;
    @Expose
    private String intro;
    @Expose
    private String media_url;


    public String getTitle() {
        return this.title;
    }
    public String getUser_id() {
        return this.user_id;
    }
    public String getIntro() {
        return this.intro;
    }
    public String getAvatar(){
        return this.media_url;
    }
}
