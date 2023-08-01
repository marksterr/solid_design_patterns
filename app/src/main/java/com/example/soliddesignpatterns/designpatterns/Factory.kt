package com.example.soliddesignpatterns.designpatterns

/*
* AnimalFactory is our factory class. It has a createAnimal function
* that takes an AnimalType and returns a new instance of the corresponding
* class. If we want to add a new Animal subclass, we just need to add a new
* case to the createAnimal function. The rest of our code doesn't need to
* change, which is the main advantage of the Factory Pattern.
* */

class AnimalFactory {
    fun createAnimal(type: AnimalType): Animal {
        return when (type) {
            AnimalType.Dog -> Dog()
            AnimalType.Cat -> Cat()
        }
    }
}

interface Animal {
    fun speak()
}

class Dog : Animal {
    override fun speak() {
        println("Woof!")
    }
}

class Cat : Animal {
    override fun speak() {
        println("Meow!")
    }
}

enum class AnimalType {
    Dog,
    Cat
}
