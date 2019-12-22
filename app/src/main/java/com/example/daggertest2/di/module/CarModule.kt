package com.example.daggertest2.di.module

import com.example.daggertest2.model.Car
import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun providesCar() : Car = Car()
}