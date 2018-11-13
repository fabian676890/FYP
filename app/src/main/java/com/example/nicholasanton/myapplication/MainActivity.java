package com.example.nicholasanton.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aware.Battery;
import com.aware.providers.Battery_Provider;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doSomething();

        //Aware.startSensor(this, Aware_Preferences.STATUS_ACCELEROMETER);
    }

    public void doSomething(){
        TextView tv1 = (TextView)findViewById(R.id.MYTEXTVIEW);
        tv1.setText(Battery_Provider.Battery_Data.CONTENT_URI);
    }
}
