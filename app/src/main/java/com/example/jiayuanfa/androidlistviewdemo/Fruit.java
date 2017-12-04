package com.example.jiayuanfa.androidlistviewdemo;

/**
 * Created by JiaYuanFa on 2017/12/5.
 * 水果类实体也就是Model
 */

public class Fruit {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    private String name;

    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }


}
