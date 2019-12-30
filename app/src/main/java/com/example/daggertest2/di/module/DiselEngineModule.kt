package com.example.daggertest2.di.module

import com.example.daggertest2.model.DiselEngine
import com.example.daggertest2.model.Engine
import dagger.Binds
import dagger.Module
import javax.inject.Inject

@Module
abstract class DiselEngineModule {
    @Binds
    abstract fun bindDiselEngine(diselEngine: DiselEngine): Engine
}