package com.example.daggertest2.model

import android.util.Log
import javax.inject.Inject

class DiselEngine @Inject constructor():Engine {
    override fun enginType() {
        Log.d("2","This is Disel Engine.............")
    }
}