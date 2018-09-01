package com.pot;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Average_Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        //....
    }
}
