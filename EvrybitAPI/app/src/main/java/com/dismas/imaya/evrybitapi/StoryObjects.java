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


    public String getTitle() {
        return this.title;
    }
    public String getUser_id() {
        return this.user_id;
    }
    public String getIntro() {
        return this.intro;
    }
}
