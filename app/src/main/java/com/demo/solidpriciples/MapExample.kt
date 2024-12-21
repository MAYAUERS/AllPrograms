package com.demo.solidpriciples

fun main(){

    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    println(numbers.mapIndexed { idx, value -> value * idx })
    println(numbers.mapNotNull { if ( it == 2) null else it * 3 })
    println(numbers.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })


}