package com.anggitprayogo.mvp.mvp.model;

import com.google.gson.annotations.SerializedName;

public class Cakes {
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
