package com.example.nicholasanton.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import com.aware.Aware;
import com.aware.Aware_Preferences;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise AWARE
        Intent aware = new Intent(this, Aware.class);
        startService(aware);
        //Activate Accelerometer
        Aware.setSetting(this, Aware_Preferences.STATUS_ACCELEROMETER, true);
        //Set sampling frequency
        Aware.setSetting(this, Aware_Preferences.FREQUENCY_ACCELEROMETER, 200000);
        //Apply settings
        Aware.startSensor(this, Aware_Preferences.STATUS_ACCELEROMETER);
    }
}