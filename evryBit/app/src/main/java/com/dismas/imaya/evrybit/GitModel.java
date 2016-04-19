package com.dismas.imaya.evrybit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by imaya on 4/19/16.
 */
public class GitModel {
    @Expose
    private String login;
    @Expose
    private Integer id;
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;

    @Expose
    private Owner owner;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getfullName() {
        return fullName;
    }
    public void setfullName(String fullName) {
        this.fullName = fullName;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
