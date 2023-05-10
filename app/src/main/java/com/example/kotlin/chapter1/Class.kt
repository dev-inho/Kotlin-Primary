package com.example.kotlin.chapter1

class Class {
}

fun main() { // Entry Point
    val user = Kid("김인호", 27, "male")
    val test = Kid(name = "김진성", age = 27, gender = "male")

    println("user : " + user.age)
    println("test : " + test.name)
    println("gender : " + user.gender)
}

open class User(open val name: String, open var age: Int = 100)

class Kid(override val name : String, override var age : Int) : User(name, age) {
    var gender: String = "female"

    init {
        println("초기화중 입니다.")
    }


    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
    }
}