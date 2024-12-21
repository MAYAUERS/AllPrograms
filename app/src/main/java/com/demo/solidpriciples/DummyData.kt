package com.demo.solidpriciples

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main():Unit = runBlocking{

    launch {
        val data1 =  produceNumber()
        data1.collect{
            println("Collect1 Numbers - $it")
        }
    }

    launch {
        val data2 =  produceNumber()
        data2.collect{
            delay(2500)
            println("Collect2 Numbers - $it")
        }
    }

}

fun produceNumber() = flow<Int> {
    val list = listOf<Int>(1,2,3,4,5,6)
    list.forEach {
        delay(1000)
        emit(it)
    }
}

