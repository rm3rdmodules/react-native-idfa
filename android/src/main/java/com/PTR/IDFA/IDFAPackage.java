package com.PTR.IDFA;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IDFAPackage implements ReactPackage {

	private Activity mActivity = null;

    public void IDFAPackage(Activity activity) {

      mActivity = activity;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {

      return Collections.emptyList();
    }


    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(
                new IDFA(reactContext)
        );
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
