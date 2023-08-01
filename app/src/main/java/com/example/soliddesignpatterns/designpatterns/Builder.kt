package com.example.soliddesignpatterns.designpatterns

/*
* CarBuilder is our builder class. It starts with an empty Car and has
* methods to set each property. Each setter method returns the builder
* itself (this), so we can chain the method calls. The build method returns
* the final Car object.
* */

data class Car(var wheels: Int? = null,
               var color: String? = null,
               var automatic: Boolean? = null)

class CarBuilder {
    private val car = Car()

    fun setWheels(wheels: Int) = apply { car.wheels = wheels }
    fun setColor(color: String) = apply { car.color = color }
    fun setAutomatic(automatic: Boolean) = apply { car.automatic = automatic }
    fun build() = car
}

fun main() {
    val car = CarBuilder()
        .setWheels(4)
        .setColor("Red")
        .setAutomatic(true)
        .build()

    println(car)  // Prints: Car(wheels=4, color=Red, automatic=true)
}