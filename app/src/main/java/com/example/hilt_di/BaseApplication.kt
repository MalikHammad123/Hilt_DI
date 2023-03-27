package com.example.hilt_di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
//through this we tell our project that we are going to implement DI in it
@HiltAndroidApp
class BaseApplication:Application() {
    override fun onCreate() {
        super.onCreate()

    }
}