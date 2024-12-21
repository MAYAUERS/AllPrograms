package com.demo.solidpriciples

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.toSet
import kotlinx.coroutines.runBlocking

fun main():Unit= runBlocking {

   produceN().map { it * 2 }
       .filter { it > 4 }
       .collect{
           println("Collect values - $it")
       }

    /*val value = data.last()
    println(value)*/
    /*val value = data.first()
    println(value)*/
    //
   /* val value = data.toList()
    println(value)*/

    //
   /* val value = data.toSet()
    println(value)*/
       /* data.onStart {
            emit(-1)
            println("Flow Started to emit values")
        }.onCompletion {
            emit(6)
            println("Flow Completed")
        }.onEach {
            println("About to emit in flow values - $it")
        }.collect{
                println("Collected flow values - $it")
    }*/

}

fun produceN()= flow<Int> {

    val list = listOf<Int>(1,2,3,4,5)
    list.forEach {
        delay(1000)
        emit(it)
    }
}