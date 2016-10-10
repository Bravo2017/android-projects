package com.dismas.imaya.checknfc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView value = (TextView) findViewById(R.id.res);
        String result = "";
        Context context = this;
        //Create PackageManager instance
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            result += "Camera: YES";
        }else{
            result += "Camera: NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT)) {
            result += "\nFront facing camera: YES";
        }else{
            result += "\nFront facing camera: NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)) {
            result += "\nCamera support flash: YES";
        }else{
            result += "\nCamera support flash: NO";
        }
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH)) {
            result += "\nBluetooth: YES";
        }else{
            result += "\nBluetooth: NO";
        }
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_NFC)) {
            result += "\nNFC: YES";
        }else{
            result += "\nNFC: NO";
        }
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_MICROPHONE)) {
            result += "\nMicrophone: YES";
        }else{
            result += "\nMicrophone: NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_SENSOR_ACCELEROMETER)) {
            result += "\nAccelerometer sensor: YES";
        }else{
            result += "\nAccelerometer sensor: NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_SENSOR_BAROMETER)) {
            result += "Barometer (air pressure sensor) :YES";
        }else{
            result += "Barometer (air pressure sensor) :NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_SENSOR_COMPASS)) {
            result += "\nMagnetometer (compass): YES";
        }else{
            result += "\nMagnetometer (compass): NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_SENSOR_GYROSCOPE)) {
            result += "\nGyroscope: YES";
        }else{
            result += "\nGyroscope: NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_SENSOR_LIGHT)) {
            result += "\nLight sensor: YES";
        }else{
            result += "\nLight sensor: NO";
        }
        if (packageManager
                .hasSystemFeature(PackageManager.FEATURE_SENSOR_PROXIMITY)) {
            result += "\nProximity sensor: YES";
        } else {
            result += "\nProximity sensor: NO";
        }
        value.setText(result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}