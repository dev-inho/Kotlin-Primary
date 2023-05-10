package com.example.kotlin.chapter1

/**
 * 반복문
 *
 */

/**
 * Entry Point
 */
fun main() {
    for (i in 1..10) {
        println("$i 번쨰")
    }
    println("-----------------")
    for (i in IntRange(1, 10)) {
        println("$i 번째")
    }
    println("-----------------")
    for (i in 1 until 10) {
        println("$i 번째")
    }
    println("-----------------")
    for (i in 1..10 step (2)) {
        println("$i 번째")
    }
    println("-----------------")
    for (i in 10 downTo 1 step (2)) {
        println("$i 번째")
    }
    println("-----------------")
    var c = 1
    while (c < 11) {
        println("$c 번째")
        c++
    }
}