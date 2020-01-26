package com.example.daggertest2.di.module

import com.example.daggertest2.model.DiselEngine
import com.example.daggertest2.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DiselEngineModule(private var horsePower: Int) {

    fun DiselEngineModule(horsePower: Int){
        this.horsePower=horsePower
    }
    @Provides
    fun providesDiselEngine():Engine{
        return DiselEngine(horsePower)
    }
}