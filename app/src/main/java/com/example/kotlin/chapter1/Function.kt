package com.example.kotlin.chapter1

/**
 * Kotlin으로 함수를 정의하는 방법
 */
class Function {

}

/**
 * Entry Point
 */
fun main() {
    test(10, c = 5)
    val result = test2("김진성", "Danny", "jsKim")

    println(result)
}

fun test(a : Int, b : Int = 3, c : Int = 4) : Int {
    println("a : $a / b: $b / c : $c")

    return a + b
}

fun test2(name : String, nickName : String, id : String) = "$name $nickName $id"