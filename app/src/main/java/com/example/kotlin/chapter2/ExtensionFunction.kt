package com.example.kotlin.chapter2

class ExtensionFunction {
    fun hello() = println("hello")
    fun bye() = println("bye")
}

fun main() {
    ExtensionFunction().hi()
}

fun ExtensionFunction.hi() = println("hi")