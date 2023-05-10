package com.example.kotlin.chapter1

/**
 * Collection (List, Map, Set)
 */

/**
 * Entry Point
 */
fun main() {
    /* List */
    val list = mutableListOf(1, 2, 3, 4, 5);

    list.add(6)

    list.addAll(listOf(7, 8, 9))
    list.removeIf{ it < 2}

    println(list)

    println( list.map{ it * 10 })


    val listOf = listOf<Int>(1, 2, 3, 4);

    println(listOf.joinToString(","))

    val diverseList = listOf(1, "안녕", 1.78, true)

    /* Map */
    val map = mutableMapOf<Int, String>((1 to "안녕"), (2 to "Hello"))

    map.put(3, "hI")
    println("map : $map")

    /* Set */
    val immutableSet = setOf<Int>(1, 2, 3)
    val mutableSet = mutableSetOf<Int>(1, 2, 3)
    mutableSet.removeIf { it < 2 }
    println(mutableSet)

}
