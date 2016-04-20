package com.dismas.imaya.jsonparserretrofit.Model;

import java.util.List;

/**
 * Created by imaya on 4/21/16.
 */
//For Line 1 in JSON File
public class Student {
    public String name;
    public String first;
    public String last;
    public int age;
    public String sex;
    public Boolean registered;
    public List<String> interests;
    public Favorites favorites;
    public List<Skills> skills;

}