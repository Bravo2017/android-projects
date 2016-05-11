package com.dismas.imaya.evrybitapi;

import com.google.gson.annotations.Expose;

/**
 * Created by imaya on 5/11/16.
 */
public class StoryModel {
    @Expose
    private StoryObjects storyObjects;

    public StoryObjects getOwner() {
        return storyObjects;
    }
    public void setOwner(StoryObjects storyObjects) {
        this.storyObjects = storyObjects;
    }
}
