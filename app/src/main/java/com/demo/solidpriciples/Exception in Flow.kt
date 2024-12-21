package com.demo.solidpriciples

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    try {
    getListOfNumbers()
        .collect{
            println("Collect Numbers - $it and Thread - ${Thread.currentThread().name}")
           // throw Exception("Error in Collector")
        }
    }catch (e:Exception){
        println("Exception - ${e.message.toString()}")
    }
}

fun getListOfNumbers() = flow<Int> {
    val list = listOf<Int>(1,2,3,4,5,6)
    list.forEach {
        delay(1000)
        println("Emitter thread - ${Thread.currentThread().name}")
        emit(it)
        throw Exception("Error in Emitter")
    }
}.catch {
    println("Emitter Exception Handling in catch - ${it.message.toString()}")
    emit(-1)
}