package com.demo.solidpriciples

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {

    getListOfNum()
        .map {
            delay(1000)
            println("Map thread - ${Thread.currentThread().name}")
            it * 2

        }.filter{
            delay(500)
            println("Filter thread - ${Thread.currentThread().name}")
            it > 0
        }
        .flowOn(Dispatchers.IO)
        .collect{
        println("Collect Numbers - $it and Thread - ${Thread.currentThread().name}")
    }
}

fun getListOfNum() = flow<Int> {
    val list = listOf<Int>(1,2,3,4,5,6)
    list.forEach {
        delay(1000)
        println("Emitter thread - ${Thread.currentThread().name}")
        emit(it)
    }
}