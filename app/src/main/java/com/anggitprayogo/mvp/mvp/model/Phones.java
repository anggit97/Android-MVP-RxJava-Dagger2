package com.anggitprayogo.mvp.mvp.model;

import com.google.gson.annotations.SerializedName;

public class Phones {
    @SerializedName("home")
    public String home;
    @SerializedName("mobile")
    public String mobile;

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }
}
