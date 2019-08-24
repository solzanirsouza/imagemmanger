package com.picture.picturemanager.model;

import java.io.Serializable;

public class ImageVo implements Serializable {

    private String imageBase64;

    public ImageVo() {
    }

    public ImageVo(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public ImageVo setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
}
