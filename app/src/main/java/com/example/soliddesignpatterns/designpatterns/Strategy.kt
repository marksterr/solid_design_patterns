package com.example.soliddesignpatterns.designpatterns

/*
* Here is the Strategy pattern. This pattern defines a family of algorithms,
* encapsulates each one, and makes them interchangeable. Strategy lets the
* algorithm vary independently from the clients that use it. In this code,
* SortingStrategy is an interface that defines a sort method. AscendingSort
* and DescendingSort are classes that implement the SortingStrategy interface
* with different algorithms.
* */

interface SortingStrategy {
    fun sort(list: List<Int>): List<Int>
}

class AscendingSort : SortingStrategy {
    override fun sort(list: List<Int>): List<Int> {
        return list.sorted()
    }
}

class DescendingSort : SortingStrategy {
    override fun sort(list: List<Int>): List<Int> {
        return list.sortedDescending()
    }
}

class NumberSorter(private val strategy: SortingStrategy) {
    fun sort(numbers: List<Int>): List<Int> {
        return strategy.sort(numbers)
    }
}

fun main() {
    val numbers = listOf(5, 2, 1, 4, 3)

    val ascendingSorter = NumberSorter(AscendingSort())
    println(ascendingSorter.sort(numbers))  // Prints: [1, 2, 3, 4, 5]

    val descendingSorter = NumberSorter(DescendingSort())
    println(descendingSorter.sort(numbers))  // Prints: [5, 4, 3, 2, 1]
}