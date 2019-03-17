package com.example.daggerpractice.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.daggerpractice.R
import com.example.daggerpractice.component.DaggerMugComponent
import com.example.daggerpractice.component.MugComponent
import com.example.daggerpractice.model.Mug
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mug: Mug

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        create object 'mug' without Dagger2
        var color = Color()
        var brand = Brand()
        var capacity = 30

        mug = Mug(color, brand)*/

        //Dagger2 used
        // first way
        /*val mugComponent: MugComponent = DaggerMugComponent.builder()
            .mililitersCapacityModule(MililitersCapacityModule(150))
            .build()*/

        //second way
        val mugComponent: MugComponent = DaggerMugComponent.builder()
            .capacityForMug(2000)
            .build()

         mugComponent.inject(this)

        //mug = mugComponent.getMug()
        mug.createMug()
    }
}
