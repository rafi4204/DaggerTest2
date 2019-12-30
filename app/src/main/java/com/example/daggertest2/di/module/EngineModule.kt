package com.example.daggertest2.di.module

import com.example.daggertest2.model.Engine
import com.example.daggertest2.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class EngineModule {
    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine): Engine
}