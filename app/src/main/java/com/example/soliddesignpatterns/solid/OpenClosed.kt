package com.example.soliddesignpatterns.solid

/*
* each Shape subclass calculates its own area. If we want to add a new shape,
* we just create a new class that implements the Shape interface. We don't
* need to modify the AreaCalculator class, so it's closed for modification
* but open for extension
* */

interface Shape {
    fun area(): Double
}

class Rectangle(val width: Double, val height: Double): Shape {
    override fun area() = width * height
}

class Circle(val radius: Double): Shape {
    override fun area() = Math.PI * radius * radius
}

class AreaCalculator {
    fun calculateArea(shape: Shape): Double {
        return shape.area()
    }
}