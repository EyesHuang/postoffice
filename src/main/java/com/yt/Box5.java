package com.yt;

public class Box5 extends Box3 {

    private static float LENGTH = 39.5f;
    private static float WIDTH = 27.5f;
    private static int HEIGHT = 23;

    public Box5(float length, float width, int height) {
        super(length, width, height);
    }

    @Override
    public boolean validate(float length, float width, int height) {
        if (length < LENGTH && width < WIDTH && height < HEIGHT) {
            return true;
        } else {
            return false;
        }
    }
}
