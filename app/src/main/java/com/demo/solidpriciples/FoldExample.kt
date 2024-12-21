package com.demo.solidpriciples

fun main(){
    val list = listOf(1, 2, 3, 4, 5)

    // fold uses the parameter as the initial value of the accumulator
    val sum = list.fold(0) { acc, i ->
        println("acc: $acc, i: $i, acc + i: ${acc + i}")
        acc + i
    }
    println(sum) // 15

    val product = list.fold(1) { acc, i ->
        println("acc: $acc, i: $i, acc * i: ${acc * i}")
        acc * i
    }
    println(product) // 120
}