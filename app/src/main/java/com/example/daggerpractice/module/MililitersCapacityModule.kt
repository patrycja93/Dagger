package com.example.daggerpractice.module

import com.example.daggerpractice.model.Capacity
import com.example.daggerpractice.model.MililitersCapacity
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
 abstract class MililitersCapacityModule {

    @Binds
    abstract fun bindMililitersCapacity(mililitersCapacity: MililitersCapacity): Capacity
}