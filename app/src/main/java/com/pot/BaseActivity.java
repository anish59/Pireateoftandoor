package com.pot;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BaseActivity extends AppCompatActivity {
    Typeface balooFont;
    Typeface robotoThin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        balooFont = Typeface.createFromAsset(getAssets(),
                "fonts/BalooChettan_Regular.ttf");

        robotoThin = Typeface.createFromAsset(getAssets(),
                "fonts/Roboto_Thin.ttf");

    }

    public void closeScreen() {
        finish();
        doSmoothAnimation();
    }

    public void doSmoothAnimation() {
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
