package com.example.daggertest2.model

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(engine: Engine, wheel: Wheel)   {

    val TAG = "Car"


    fun drive() {
        Log.d(TAG, "driving..........")
    }

    fun letsRoll() {
        Log.d(TAG, "LetsRoll..........")
    }
}