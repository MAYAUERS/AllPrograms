package com.demo.solidpriciples

import android.util.Log
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main():Unit = runBlocking{
    val supervisorJob = SupervisorJob()

    val coroutineScope = CoroutineScope(Dispatchers.Default + supervisorJob)

    val job1 = coroutineScope.launch {
        println("Child coroutine 1 started")
        delay(1000)
        println("Child coroutine 1 completed")
    }

    val job2 = coroutineScope.launch {
        try {
            println("Child coroutine 2 started")
            delay(2000)
            throw RuntimeException("Something went wrong in coroutine 2")
        } catch (e: Exception) {
            println("Coroutine 2 failed: ${e.message}")
        }
    }

    job1.join()
    job2.join()

    supervisorJob.cancel()
}