package com.example.daggertest2.model

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {

    fun brand(){
        Log.d("2","Wheel brand is = Toyota")
    }
}