package com.example.nicholasanton.myapplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doSomething();

        //Aware.startSensor(this, Aware_Preferences.STATUS_ACCELEROMETER);

    }

    public void doSomething(){
        Intent intent  = registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int    level   = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        int    scale   = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
        int    percent = (level*100)/scale;
        TextView tv1 = (TextView)findViewById(R.id.MYTEXTVIEW);
        tv1.setText(String.valueOf(percent) + "%");
    }
}
