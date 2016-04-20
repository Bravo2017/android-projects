package com.dismas.imaya.evrybit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by imaya on 4/19/16.
 */
public class GitModel {

        @Expose
        private Owner owner;

        public class MyThingResponse {
            public InnerResponse response;
        }

        public class InnerResponse {
            public String meta;
            public List<GitModel> objects;
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

        public Owner getOwner() {
            return owner;
        }
        public void setOwner(Owner owner) {
            this.owner = owner;
        }
}
