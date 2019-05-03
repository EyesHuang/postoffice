package com.yt;

public class Box3 {
    float length;
    float width;
    int height;

    private static float LENGTH = 23f;
    private static float WIDTH = 14f;
    private static int HEIGHT = 13;

    public Box3(float length, float width, int height) {
        if (length != 0 && width != 0 && height != 0) {
            this.length = length;
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Need to set values > 0");
        }
    }

    public boolean validate(float length, float width, int height) {
        if (length < LENGTH && width < WIDTH && height < HEIGHT) {
            return true;
        } else {
            return false;
        }
    }



}
