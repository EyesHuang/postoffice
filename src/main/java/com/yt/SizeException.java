package com.yt;

public class SizeException extends Exception {

    @Override
    public String getMessage() {
        return "Need to set values > 0";
    }

    public SizeException() {
        System.err.println("Need to set values > 0");
    }
}
