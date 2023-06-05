package com.example.kotlin.chapter2

class ScopeFunction {
}

class User (
    val name : String,
    val age : Int,
    val gender : Boolean,
)

fun main() {
    val user = User("김진성", 27, true)

    user.let {
        println(it.age)
    }

    user.run {
        println(this.gender)
    }

    user.apply {
        println(name)
    }

    user.also {
        println("${it.name} ${it.age} ${it.gender}")
    }

    with(user) {
        println(this.age)
    }
}