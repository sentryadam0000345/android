package com.example.vu.android;

public class NativeSample {

    public static native void crash();

    public static native void message();

    static {
        System.loadLibrary("native-sample");
    }
}