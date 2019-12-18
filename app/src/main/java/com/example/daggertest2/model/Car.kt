package com.example.daggertest2.model

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {

    val TAG = "Car"
    @Inject lateinit var engine: Engine
    @Inject lateinit var wheel: Wheel

    fun drive() {
        Log.d(TAG, "driving..........")
    }
    @Inject
    fun letsRoll() {
        Log.d(TAG, "LetsRoll..........")
    }
}