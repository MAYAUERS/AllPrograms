package com.demo.solidpriciples

fun main(){
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.first().uppercase() })
    println(numbers.associateWith { it.length })

}