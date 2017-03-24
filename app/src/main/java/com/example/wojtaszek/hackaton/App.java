package com.example.wojtaszek.hackaton;

import android.app.Application;

import com.kontakt.sdk.android.common.KontaktSDK;

/**
 * Created by Wojtaszek on 24.03.2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KontaktSDK.initialize(this);
    }
}
