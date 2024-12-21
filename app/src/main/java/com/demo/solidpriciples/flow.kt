package com.demo.solidpriciples

import android.annotation.SuppressLint
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    var flow = flowOf(1).collect{emittedValue->
        println("First Flow -> $emittedValue")
    }

    var secFlow = flowOf(1,2,3,4,5).collect{
        println("Second Flow -> $it")
    }

    var thirdFlow = flowOf(1,"Two",3,"Four").collect{
        println("Third Flow -> $it")
    }

    listOf("A","B","C").asFlow().collect{
        println("Fourth Convert List to Flow -> $it")
    }

    flow {
        delay(1000)
        emit("Item emitted after 1000ms")
    }.collect{
        println("Flow collected-> $it")
    }


        produceNumberList()
            .map { it * 10 }
            .filter { it > 20 }
            .collect {
            println("Collector Numbers from List -> $it")
        }

   /* val time2 = measureTimeMillis {
        produceNumberList().collect {
            delay(2500)
            println("Collector2 Numbers from List -> $it")
        }
    }*/
  //  println("Time taken for collecting flow - $time1")
  //  println("Time taken for collecting flow - $time2")
    produceNum().collect{
        println(it)
    }
}

@SuppressLint("SuspiciousIndentation")
fun produceNumberList() = flow<Int> {
    val numbers = listOf<Int>(1,2,3,4,5,6)
        numbers.forEach {
            delay(1000)
            emit(it)
        }
}

fun produceNum() = flow<Int>{
    var mutableStateFlow = MutableStateFlow<Int>(10)
    delay(100)
    emit(20)
    delay(100)
    emit(30)
}

//fun producerNumberList():Flow<Int> = listOf<Int>(1,2,3,4,5,6).asFlow()
