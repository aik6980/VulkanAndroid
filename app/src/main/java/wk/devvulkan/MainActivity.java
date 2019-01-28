package wk.devvulkan;

import android.app.NativeActivity;
import android.os.Bundle;

public class MainActivity extends NativeActivity {

    // static block: execute before main(), in this case this is where we load out android_main()
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
