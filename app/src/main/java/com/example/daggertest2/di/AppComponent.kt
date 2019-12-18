package com.example.daggertest2.di

import com.example.daggertest2.FirstFragment
import dagger.Component

@Component
interface AppComponent {

   fun inject(target:FirstFragment)
}