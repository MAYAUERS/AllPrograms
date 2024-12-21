package com.demo.solidpriciples


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main():Unit= runBlocking {

        launch {
           var result = producer1()
            println("Value of ${ result.value}")
               result.collect {
                    println("Collect- $it ")
                }
        }
   /* launch {
        val result = producer1()
        delay(6000)
            result.collect {
                println("Collect2 Numbers - $it ")
            }
    }*/


}

/*
fun getListOfNumbers1():Flow<Int> {
    var mutableStateFlow = MutableStateFlow(1)
    val list = listOf<Int>(1,2,3,4,5)
    GlobalScope.launch {
        list.forEach {
            delay(1000)
            mutableStateFlow.emit(it)
        }
    }
    return mutableStateFlow
}*/

fun producer1():StateFlow<Int> {
    var mutableStateFlow = MutableStateFlow(10)
    GlobalScope.launch {
        delay(2000)
        mutableStateFlow.emit(20)
        delay(2000)
        mutableStateFlow.emit(30)
    }
    return mutableStateFlow
}
