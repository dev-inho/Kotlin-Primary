package com.example.kotlin.chapter1

/**
 * 타입 체크 및 캐스팅
 */

/**
 * Entry Point
 */
fun main() {
    println(smartCast(10))
}

fun check(a: Any): String {
    return if (a is String) {
        "문자열"
    } else if (a is Int) {
        "숫자"
    } else {
        "몰라요"
    }
}

fun cast(a: Any) {
    val result = a as? String ?: "캐스팅 실패"

    println(result)
}

fun smartCast(a: Any): Int {
    return if(a is String) {
        a.length
    } else if (a is Int) {
        a.dec()
    } else {
        -1
    }
}