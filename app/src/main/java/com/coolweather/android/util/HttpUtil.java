package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    private static final String TAG = "HttpUtil";
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        Log.d(TAG,"那里错了啊啊啊啊");
        OkHttpClient client = new OkHttpClient();
        Log.d("CoolWeatheraaaaaaa","哪里错了？");
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
