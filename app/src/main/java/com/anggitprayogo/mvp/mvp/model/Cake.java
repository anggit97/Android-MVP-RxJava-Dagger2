package com.anggitprayogo.mvp.mvp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Anggit on 23/12/2017.
 */

public class Cake {


    @SerializedName("id")
    public int id;
    @SerializedName("title")
    public String title;
    @SerializedName("previewDescription")
    public String previewdescription;
    @SerializedName("detailDescription")
    public String detaildescription;
    @SerializedName("image")
    public String image;


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPreviewdescription(String previewdescription) {
        this.previewdescription = previewdescription;
    }

    public void setDetaildescription(String detaildescription) {
        this.detaildescription = detaildescription;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPreviewdescription() {
        return previewdescription;
    }

    public String getDetaildescription() {
        return detaildescription;
    }

    public String getImage() {
        return image;
    }
}
