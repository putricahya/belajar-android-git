package com.example.amikom.singleaplication;

import android.content.Intent;
import android.preference.Preference;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amikom.singleaplication.util.PreferencesHelper;

import java.util.prefs.Preferences;

public class SplashActivity extends AppCompatActivity {
    PreferencesHelper instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(() -> {
            if (instance.isLogin()){
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
            else{
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, splashInterval);
    }
}
