package com.dismas.imaya.evrybit;

import com.google.gson.annotations.Expose;

/**
 * Created by imaya on 4/19/16.
 */

public class Owner {

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
