package com.demo.solidpriciples

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.cancellation.CancellationException

fun main():Unit = runBlocking{

    coroutineScope {
        val job1 = launch {
            println("starting Coroutine 1")
        }
        val job4 = async() {
            println("starting Coroutine 4")
            throw java.lang.IllegalStateException("Exception in Coroutine 4 inside supervisor scope")
        }

        val job5 = async() {
            println("starting Coroutine 5")
            throw java.lang.IllegalStateException("Exception in Coroutine 5 inside supervisor scope")
        }

        try {
            job4.await()
        } catch (e: Exception) {
            println("Handle $e in try/catch")
        }

        try {
            job5.await()
        } catch (e: Exception) {
            println("Handle $e in try/catch")
        }
    }
}