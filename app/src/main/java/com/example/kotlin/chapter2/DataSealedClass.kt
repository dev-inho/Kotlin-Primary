package com.example.kotlin.chapter2

class DataSealedClass {
}

fun main() {
    val person = Person("Hello", 20)

}

class Person(
    val name : String,
    val age : Int
)

data class Dog(
    val name : String,
    val age : Int
)


abstract class Cat(

)

class BlueClass : Cat()
class GreenClass : Cat()
class RedClass : Cat()