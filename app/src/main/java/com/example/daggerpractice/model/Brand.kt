package com.example.daggerpractice.model

import javax.inject.Inject

class Brand @Inject constructor() {

    var name: String = ""
    var amountOfEmployees: Int = 0

    constructor(name: String, amountOfEmployees: Int) : this() {
        this.name = name
        this.amountOfEmployees = amountOfEmployees
    }
}