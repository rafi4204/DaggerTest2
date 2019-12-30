package com.example.daggertest2.model

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    override fun enginType() {
        Log.d("2", "this is Petrol Engine.................")
    }
}