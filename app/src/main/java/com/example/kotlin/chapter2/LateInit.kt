package com.example.kotlin.chapter2

class LateInit {
}

lateinit var text : String
val test : Int by lazy {
    100
}

fun main() {
    text = "김진성"
    println(text)
}