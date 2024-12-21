package com.demo.solidpriciples

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val stateFlow = MutableStateFlow<Int>(0)

    println(stateFlow.value)

    repeat(10_000){
        launch {
            stateFlow.update{
                it + 1
            }
        }
    }

    println(stateFlow.value)

}