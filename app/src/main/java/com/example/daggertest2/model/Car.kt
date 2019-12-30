package com.example.daggertest2.model

import android.util.Log


class Car(var engine: Engine, wheel: Wheel) {

    val TAG = "Car"

    fun drive() {
        engine.enginType()
        Log.d(TAG, "driving..........")
    }

    fun letsRoll() {
        Log.d(TAG, "LetsRoll..........")
    }
}