package com.example.kotlin.chapter1

/**
 * 조건문
 */

fun main() {
    val result = isHoliday(5)
}

fun max(a: Int, b: Int) {
    val result = if(a > b) a else b

    println(result)
}

/**
 * @param dayOfWeek: 월 화 수 목 금 토 일
 */
fun isHoliday(dayOfWeek: Any) {
    val result = when(dayOfWeek) {
        "토", "일" -> if(dayOfWeek == "토") "좋아" else "싫어"
        in 2 .. 4 -> println("숫자다")
        in listOf("월", "화") -> println("리스트다")
        else -> false
    }

    println(result)
}

