package com.cherry.testopencv.imgprocess;

import android.graphics.Bitmap;

public class ImageProcess {

    static {
        System.loadLibrary("native-lib");
    }

    public static native Bitmap processFace(Bitmap bitmap);
}
