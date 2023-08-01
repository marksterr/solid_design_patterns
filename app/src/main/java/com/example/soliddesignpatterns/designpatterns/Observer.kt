package com.example.soliddesignpatterns.designpatterns

/*
* NewsPublisher is our subject. It maintains a list of observers and has
* methods to add (subscribe) and remove (unsubscribe) observers. The
* notifyObservers method is called to update all observers when there's a state
* change. In the main function, we create a NewsPublisher and two User observers,
* Bob and Alice. We add both users to the NewsPublisher's observer list. When we
* call notifyObservers, both users receive the update. After we remove Bob from the
* observer list, only Alice receives updates.
* */

interface Observer {
    fun update(message: String)
}

class User(private val name: String) : Observer {
    override fun update(message: String) {
        println("$name received: $message")
    }
}

class NewsPublisher {
    private val observers = mutableListOf<Observer>()

    fun subscribe(observer: Observer) {
        observers.add(observer)
    }

    fun unsubscribe(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers(message: String) {
        observers.forEach { it.update(message) }
    }
}

fun main() {
    val newsPublisher = NewsPublisher()

    val bob = User("Bob")
    val alice = User("Alice")

    newsPublisher.subscribe(bob)
    newsPublisher.subscribe(alice)

    newsPublisher.notifyObservers("Breaking News!")
    // Prints:
    // Bob received: Breaking News!
    // Alice received: Breaking News!

    newsPublisher.unsubscribe(bob)

    newsPublisher.notifyObservers("More Breaking News!")
    // Prints: Alice received: More Breaking News!
}