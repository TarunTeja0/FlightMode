package com.example.flightmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        FMBroadReceiv receiver = new FMBroadReceiv();
        registerReceiver(receiver, intentFilter);




        Intent intent = new Intent();
        intent.setAction("com.example.flightmode");
        // add this line to have intent delivered explicitly to your app
        // use package name of your ReceiveBroadcast project
        intent.setPackage("com.example.flightmode");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        sendBroadcast(intent);
        System.out.println("Sent!!!");

//
//        IntentFilter intentFilter = new IntentFilter(android.);
//
//    BroadcastReceiver flightModeBroadcastReceiver = new FlightModeBroadcastReceiver();
//
//context.registerReceiver(flightModeBroadcastReceiver, intentFilter);


    }
}