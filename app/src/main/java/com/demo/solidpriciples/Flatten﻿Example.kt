package com.demo.solidpriciples

fun main(){
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())

    val containers1 = listOf(
        (listOf("one", "two", "three")),
        (listOf("four", "five", "six")),
        (listOf("seven", "eight"))
    )

    println(containers1.flatten())
}