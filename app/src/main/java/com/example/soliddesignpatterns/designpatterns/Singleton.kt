package com.example.soliddesignpatterns.designpatterns

/*
* Singleton is an object declaration, not a class. This is Kotlin's way of creating a Singleton.
* It's thread-safe, and it will only ever have one instance, as guaranteed by the Kotlin language.
* */

object Singleton {
    init {
        println("Singleton class invoked.")
    }

    var data: String? = null

    fun displayData() {
        println(data)
    }
}