package com.anggitprayogo.mvp.mvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Anggit on 22/12/2017.
 */

public class CakeResponse {


    @SerializedName("product")
    public String product;
    @SerializedName("version")
    public double version;
    @SerializedName("releaseDate")
    public String releasedate;
    @SerializedName("cakes")
    public List<Cakes> cakes;
    @SerializedName("staffContacts")
    public List<Staffcontacts> staffcontacts;

    public String getProduct() {
        return product;
    }

    public double getVersion() {
        return version;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public List<Cakes> getCakes() {
        return cakes;
    }

    public List<Staffcontacts> getStaffcontacts() {
        return staffcontacts;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public void setCakes(List<Cakes> cakes) {
        this.cakes = cakes;
    }

    public void setStaffcontacts(List<Staffcontacts> staffcontacts) {
        this.staffcontacts = staffcontacts;
    }
}
