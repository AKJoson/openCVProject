#include <jni.h>
#include <string>
#include <opencv2/opencv.hpp>
#include <android/bitmap.h>
#include <opencv2/imgproc/types_c.h>
#include <opencv2/core.hpp>

using namespace cv;
#ifndef Java_com_cherry_testopencv_ImageProcess
#define Java_com_cherry_testopencv_ImageProcess

#ifdef __cplusplus
extern "C" {
#endif
JNIEXPORT jobject JNICALL
Java_com_cherry_testopencv_ImageProcess_processFace(JNIEnv *env, jclass thiz, jobject bitmap);
#ifdef __cplusplus
}
#endif
#endif

extern "C"
JNIEXPORT jobject JNICALL

Java_com_cherry_testopencv_ImageProcess_processFace(JNIEnv *env, jclass thiz, jobject bitmap) {
    Mat matBitmap;
    //Bitmap 转Mat

    return nullptr;
}
