package com.launcher.materialtest;

/**
 * Created by LBW on 2018/12/11.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit( String name,int imageId) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }
}
