package com.gmail.vanyadubik.privatebankinfo.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.gmail.vanyadubik.privatebankinfo.R;

public class NetworkUtils {

    public static String checkEthernet(Context context) {

        final ConnectivityManager conMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();

        if (activeNetwork != null && activeNetwork.isConnected()) {
            return null;
        } else {
            return context.getString(R.string.error_internet_connecting);
        }
    }
}
