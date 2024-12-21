package com.demo.solidpriciples

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val jobOdd = launch {
        getOddNumbers()
    }

    val jobEven = launch {
        getEvenNumbers()
    }

    jobOdd.join()
    jobEven.join()
    println("Finished All Jobs")
}

suspend fun getOddNumbers(){
    var odd = 1
    while (odd <= 10){
        println("Odd Numbers - $odd")
        delay(2000)
        odd += 2
    }
}

suspend fun getEvenNumbers(){
    var even = 2
    while (even <= 10){
        println("Even Numbers - $even")
        delay(2000)
        even += 2
    }
}