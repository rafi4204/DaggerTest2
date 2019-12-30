package com.example.daggertest2.di

import com.example.daggertest2.ui.FirstFragment
import com.example.daggertest2.di.module.CarModule
import com.example.daggertest2.di.module.DiselEngineModule
import com.example.daggertest2.di.module.PetrolEngineModule
import dagger.Component

@Component(modules = [ DiselEngineModule::class])

interface AppComponent {

   fun inject(target: FirstFragment)
}
