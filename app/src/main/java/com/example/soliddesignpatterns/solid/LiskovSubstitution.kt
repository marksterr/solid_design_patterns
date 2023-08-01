package com.example.soliddesignpatterns.solid

/*
* only birds that can fly are subclasses of FlyingBird. The Penguin class
* is a direct subclass of Bird, so it doesn't have a fly method. Now, if
* a bird can fly (i.e., it's a FlyingBird), we can pass it to the letBirdFly
* function without any issues which demonstrates subclasses being substitutable
* for their base class
*/

open class Bird

open class FlyingBird: Bird() {
    fun fly() {
        // Implementation for flying
    }
}

class Eagle: FlyingBird()

class Penguin: Bird()

fun letBirdFly(bird: FlyingBird) {
    bird.fly()
}