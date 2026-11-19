
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_code2droid_MainActivity_getEngineStatus(
    JNIEnv* env,
    jobject
) {
    std::string message =
        "Code2Droid C++ Engine is running!";

    return env->NewStringUTF(message.c_str());
}
