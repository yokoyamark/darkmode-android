package com.example.rinde.myapplication2

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}