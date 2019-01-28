#include <jni.h>
#include <string>

#include <android/native_activity.h>
#include <android/asset_manager.h>
#include <android_native_app_glue.h>
#include <sys/system_properties.h>

std::unique_ptr<App> app;
void android_main(android_app* state)
{
    state->userData = app;
    
}