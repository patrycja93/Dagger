package com.example.daggerpractice.component

import com.example.daggerpractice.model.Mug
import com.example.daggerpractice.module.ColorModule
import com.example.daggerpractice.module.MililitersCapacityModule
import com.example.daggerpractice.view.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [ColorModule::class, MililitersCapacityModule::class])
interface MugComponent {
    fun getMug(): Mug

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun capacityForMug(capacity: Int): Builder

        fun build(): MugComponent
    }
}