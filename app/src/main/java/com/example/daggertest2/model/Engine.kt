package com.example.daggertest2.model

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    fun enginType() {
        Log.d("2", "engin type is 4 strock")
    }
}