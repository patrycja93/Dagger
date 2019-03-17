package com.example.daggerpractice.model

import android.graphics.Color
import javax.inject.Inject

class Mug @Inject constructor(val color: Color, val brand: Brand, val capacity: Capacity) {

    fun createMug(){
        capacity.complete()
        println("Just created a mug...")
    }
}