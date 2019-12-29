package com.example.daggertest2.di.module

import com.example.daggertest2.model.Car
import com.example.daggertest2.model.Engine
import com.example.daggertest2.model.Wheel
import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun provideWheel(): Wheel = Wheel()

    @Provides
    fun provideEngine(): Engine = Engine()

    @Provides
    fun providesCar(engine:Engine,wheel :Wheel): Car = Car(engine,wheel)
}