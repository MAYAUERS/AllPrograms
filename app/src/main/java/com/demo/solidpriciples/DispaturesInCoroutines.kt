package com.demo.solidpriciples

import kotlinx.coroutines.*

fun main(): Unit = runBlocking{

    //Without parameter - confined Dispature
    launch {
        println("C0 CoroutineContext = ${Thread.currentThread().name}")
        delay(100)
        println("C0 After delay Launch CoroutineContext = ${Thread.currentThread().name}")
    }

    //with parameter and GlobleScope.launch works same
    launch(Dispatchers.Default) {
        println("C1 CoroutineContext = ${Thread.currentThread().name}")
        delay(100)
        println("C1 After delay Launch CoroutineContext = ${Thread.currentThread().name}")
    }
    //
    GlobalScope.launch() {
        println("C2 CoroutineContext = ${Thread.currentThread().name}")
        delay(100)
        println("C2 After delay Launch CoroutineContext = ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Unconfined) {
        println("C3 CoroutineContext = ${Thread.currentThread().name}")
        delay(100)
        println("C3 After delay Launch CoroutineContext = ${Thread.currentThread().name}")

        launch(coroutineContext) {
            println("C6 CoroutineContext = ${Thread.currentThread().name}")
            delay(100)
            println("C6 After delay Launch CoroutineContext = ${Thread.currentThread().name}")
        }
    }

    launch(coroutineContext) {
        println("C4 CoroutineContext = ${Thread.currentThread().name}")
        delay(100)
        println("C4 After delay Launch CoroutineContext = ${Thread.currentThread().name}")
    }

    launch(Dispatchers.IO) {
        println("C5 CoroutineContext = ${Thread.currentThread().name}")
        delay(100)
        println("C5 After delay Launch CoroutineContext = ${Thread.currentThread().name}")
    }
}