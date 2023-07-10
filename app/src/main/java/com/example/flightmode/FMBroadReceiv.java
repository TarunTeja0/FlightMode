package com.example.flightmode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class FMBroadReceiv extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Check if the system is in flight mode
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        boolean isAirplaneModeOn = networkInfo == null || !networkInfo.isConnected();

        // If the system is in flight mode, do something
        if (isAirplaneModeOn) {
            Toast.makeText(context.getApplicationContext(), "Flight Mode On",Toast.LENGTH_SHORT).show();
        }

    }
}
