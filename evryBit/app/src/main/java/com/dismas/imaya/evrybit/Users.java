package com.dismas.imaya.evrybit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imaya on 4/20/16.
 */
public class Users {
    public List<GitModel> getUsers() {
        return users;
    }

    public void setUsers(List<GitModel> users) {
        this.users = users;
    }

    List<GitModel> users = new ArrayList<GitModel>();

}
