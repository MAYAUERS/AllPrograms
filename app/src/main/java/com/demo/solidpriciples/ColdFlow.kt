package com.demo.solidpriciples

import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main():Unit = runBlocking {

    //flows became inactive on cancellation of collecting coroutine
 /* val job1:Job = launch {
      coldFlow().collect {
          println("Collect - $it")
      }
  }
    delay(1500)
    job1.cancelAndJoin()*/

    launch {
        coldFlow().collect {
            println("Collect1 collects- $it")
        }
    }
    launch {
        coldFlow().collect {
            println("Collect2 collects- $it")
        }
    }
}

fun coldFlow(): Flow<Int> = flow{
    println("Emit 1")
    emit(1)
    delay(1000)
    println("Emit 2")
    emit(2)
    delay(1000)
    println("Emit 3")
    emit(3)
    delay(1000)
}


