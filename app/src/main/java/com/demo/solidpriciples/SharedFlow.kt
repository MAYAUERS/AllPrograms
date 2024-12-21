package com.demo.solidpriciples


import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main():Unit= runBlocking {

    launch{
            val result1 = getListOfNumbers2()
                result1.collect {
                    println("Collect1 Numbers - $it")
                }
        }

    launch{
        val result = getListOfNumbers2()
         delay(2500)
           result .collect {
                println("Collect2 Numbers - $it")
            }
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun getListOfNumbers2():Flow<Int>{
    val mutableSharedFlow = MutableSharedFlow<Int>(2)
    GlobalScope.launch {
        val num = listOf<Int>(1, 2, 3, 4, 5)
        num.forEach {
            mutableSharedFlow.emit(it)
            delay(1000)
        }
    }
    return mutableSharedFlow
}