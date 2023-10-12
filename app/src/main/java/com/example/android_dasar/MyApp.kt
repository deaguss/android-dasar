package com.example.android_dasar

import android.app.Application
import android.util.Log

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("APP", "my aplplication running....")
    }

}