package com.demo.solidpriciples

fun main(){
    val containers = listOf(
        (listOf("one", "two", "three")),
        (listOf("four", "five", "six")),
        (listOf("seven", "eight"))
    )
    println(containers.flatMap { it })


    val numbers = listOf("one", "two", "three", "four")

    println(numbers)
    println(numbers.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println(listString)
}