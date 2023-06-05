package com.example.kotlin.chapter2

fun main() {
    Counter.countUp()

    println(Counter.count)

    println(Book.NAME)
    println(Book.Novel.NAME)
}

object Counter {
    init {
        println("Counter 초기화")
    }

    var count = 0

    fun countUp() {
        count++
    }

    fun countDown() {
        count--
    }
}

class Book {
    companion object Novel {
        val NAME = "HELLO"
    }
}