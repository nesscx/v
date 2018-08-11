package com.example;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Calendar;

public class GetDateModule extends ReactContextBaseJavaModule {

    public GetDateModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "GetDate";
    }

    public String getToday() {
        return Calendar.getInstance().getTime().toString();
    }

    @ReactMethod
    public String now() {
        return "hola :v";
    }
}