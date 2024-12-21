package com.demo.solidpriciples

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main():Unit = runBlocking {
    var time = measureTimeMillis{
        getNumList()
            .buffer(3)
            .collect{
            delay(1500)
            println("Collect Number List = $it ")
        }
    }
    println("Time consumed $time")

}

fun getNumList()= flow<Int> {
    var list = listOf<Int>(1,2,3,4,5,6)

    list.forEach {
        delay(1000)
        emit(it)
    }
}