package com.example.daggerpractice.module

import android.graphics.Color
import dagger.Module
import dagger.Provides

@Module
class ColorModule {

    @Provides
    fun provideColor(): Color{
        println("Color was created....")
        return Color()
    }
}