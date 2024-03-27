package com.example.igutovdelivery;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstLaunch = sharedPreferences.getBoolean("isFirstLaunch", true);
        if (isFirstLaunch) {
            startActivity(new Intent(this, OnboardingActivity.class));
        } else {

            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
    }
}