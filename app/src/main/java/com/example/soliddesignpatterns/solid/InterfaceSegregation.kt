package com.example.soliddesignpatterns.solid

/*
* we have two interfaces: Worker and Eater. The HumanWorker class implements
* both interfaces because humans can work and eat, but the RobotWorker class
* only implements the Worker interface because robots can only work. This design
* adheres to the Interface Segregation Principle
*
*/

interface Worker {
    fun work()
}

interface Eater {
    fun eat()
}

class HumanWorker : Worker, Eater {
    override fun work() {
        // Working implementation
    }

    override fun eat() {
        // Eating implementation
    }
}

class RobotWorker : Worker {
    override fun work() {
        // Working implementation
    }
}