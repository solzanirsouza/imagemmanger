package com.picture.picturemanager.model;

import java.io.Serializable;

public class ImageDto implements Serializable {

    private String urlImage;

    public String getUrlImage() {
        return urlImage;
    }

    public ImageDto setUrlImage(String urlImage) {
        this.urlImage = urlImage;
        return this;
    }
}
