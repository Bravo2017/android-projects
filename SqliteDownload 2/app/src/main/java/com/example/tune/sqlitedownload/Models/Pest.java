package com.example.tune.sqlitedownload.Models;

import com.google.gson.annotations.SerializedName;



public class Pest {

    @SerializedName("pestid")
    public String ID;
    @SerializedName("pestname")
    public String pestName;
    @SerializedName("status")
    public String status;

}
