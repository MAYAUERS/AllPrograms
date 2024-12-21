package com.demo.solidpriciples

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main():Unit = runBlocking{

    val sharedFlow = MutableSharedFlow<Int>()

    val scope = CoroutineScope(Dispatchers.Default)

    scope.launch {
        repeat(5){
            println("Shared Flow Emits $it")
            sharedFlow.emit(it)
            delay(200)
        }
    }

    scope.launch {
        sharedFlow.collect{
            println("Collected in - $it collector 1")
        }
    }

    scope.launch {
        sharedFlow.collect{
            println("Collected in - $it collector 2")
        }
    }
    Thread.sleep(1500)

}