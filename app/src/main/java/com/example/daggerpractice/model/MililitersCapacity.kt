package com.example.daggerpractice.model

import javax.inject.Inject

class MililitersCapacity : Capacity {

    var capacity = 0

    @Inject
    constructor(capacity: Int) {
        this.capacity = capacity
    }

    override fun complete() {
        println("Mug is completed the capacity with capacity amount: $capacity")
    }
}