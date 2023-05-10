package com.example.kotlin.chapter1

/**
 * Null
 */

/**
 * Entry Point
 */
fun main() {
    var name: String = "상아"
    val number: Int = 10

    var nickName: String? = null

    var result = nickName?: "값이 없음"

    println(result)

    var size = nickName!!.length

    println("size : $size")
}