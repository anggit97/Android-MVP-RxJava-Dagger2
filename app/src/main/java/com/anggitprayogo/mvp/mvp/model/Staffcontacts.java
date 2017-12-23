package com.anggitprayogo.mvp.mvp.model;

import com.google.gson.annotations.SerializedName;

public class Staffcontacts {
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("phones")
    public Phones phones;
    @SerializedName("role")
    public String role;
    @SerializedName("dateOfBirth")
    public String dateofbirth;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Phones getPhones() {
        return phones;
    }

    public String getRole() {
        return role;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

}
