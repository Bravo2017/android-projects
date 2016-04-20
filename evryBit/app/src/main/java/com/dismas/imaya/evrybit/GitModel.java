package com.dismas.imaya.evrybit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by imaya on 4/19/16.
 */
public class GitModel {

        @Expose
        private Owner owner;

        public Owner getOwner() {
            return owner;
        }
        public void setOwner(Owner owner) {
            this.owner = owner;
        }
}
