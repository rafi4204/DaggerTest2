package com.example.daggertest2.di

import com.example.daggertest2.FirstFragment
import com.example.daggertest2.di.module.CarModule
import dagger.Component

@Component/*(modules = [CarModule::class])*/

interface AppComponent {

   fun inject(target:FirstFragment)
}
