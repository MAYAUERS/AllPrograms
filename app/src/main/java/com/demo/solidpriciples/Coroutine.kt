package com.demo.solidpriciples

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import kotlinx.coroutines.yield
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

/*
fun main() = runBlocking {
    println("Main Program Starts = ${Thread.currentThread().name}")
 */
/* val job :Job = launch{
        println("Fake work starts = ${Thread.currentThread().name}")
        someDelay(1000)
       // Thread.sleep(100)
        println("Fake work ends = ${Thread.currentThread().name}")
    }*//*

    val job :Deferred<String> = async{
        println("Fake work starts = ${Thread.currentThread().name}")
        someDelay(1000)
        // Thread.sleep(100)
        println("Fake work ends = ${Thread.currentThread().name}")
        "Hi Meera"
    }
    val detail = job.await()
    println("Output : $detail")
  //  job.join()
   // someDelay(2000)
    //Thread.sleep(1000)
    println("Main Program ends = ${Thread.currentThread().name}")

}
suspend fun someDelay(time:Long){
    delay(time)
}*/

fun main() = runBlocking{
/*
//CancellationException
    println("Main Program Starts = ${Thread.currentThread().name}")
    val job :Job = launch(Dispatchers.Default){
        try {
            for (i in 0..500){
                print("$i." )
                delay(5)
            }
        }catch (e:CancellationException){
            println("Exception Caught in Coroutine =  ${e.message}")
        }
        finally {
            withContext(NonCancellable){
                delay(10)
                println("In Coroutine finally block")
            }
        }
    }
    delay(10)
    job.cancel(CancellationException("My Own crash message"))
    job.join()
    println("Main Program ends = ${Thread.currentThread().name}")
*/

//withTimeout
  /*  println("Main Program Starts = ${Thread.currentThread().name}")
    withTimeout(2000){
        try {
            for (i in 0..500){
                print("$i." )
                delay(500)
            }
        }catch (e:TimeoutCancellationException){
            println("Exception Caught in Coroutine =  ${e.message}")
        }
        finally {
            withContext(NonCancellable){
                delay(10)
                println("In Coroutine finally block")
            }
        }
    }
        println("Main Program ends = ${Thread.currentThread().name}")
    */
//withTimeoutOrNull
   /* println("Main Program Starts = ${Thread.currentThread().name}")
    var result:String? = withTimeoutOrNull(2000){
            for (i in 0..500) {
                print("$i.")
                delay(1)
            }
        "I'm done"
    }
    println(result)
    println("Main Program ends = ${Thread.currentThread().name}")
*/
    //launch fun with sequencial execution
  /*  println("Main Program Starts = ${Thread.currentThread().name}")

    val time = measureTimeMillis {
        val msgOne = getMessageOne()
        val msgTwo = getMessageTwo()
        println("The entire message= ${msgOne + msgTwo}")
    }
    println("Complete time in $time")
    println("Main Program ends = ${Thread.currentThread().name}")*/

    //async build for concurrent execution
   /* println("Main Program Starts = ${Thread.currentThread().name}")
    val time = measureTimeMillis {
        val msgOne:Deferred<String> = async { getMessageOne()}
        val msgTwo:Deferred<String> = async { getMessageTwo()}
        println("The entire message= ${msgOne.await() + msgTwo.await()}")
    }
    println("Complete time in $time")
    println("Main Program ends = ${Thread.currentThread().name}")*/

    //Lazy excution of coroutine
    println("Main Program Starts = ${Thread.currentThread().name}")

        val msgOne:Deferred<String> = async(start = CoroutineStart.LAZY){ getMessageOne()}
        val msgTwo:Deferred<String> = async(start = CoroutineStart.LAZY) { getMessageTwo()}
        println("The entire message= ${msgOne.await() + msgTwo.await()}")
    println("Main Program ends = ${Thread.currentThread().name}")

    val job = launch {
        println("CoroutineScope = $this")

        async {
            println("async CoroutineScope = $this")
        }
    }
    async {
        println("CoroutineScope = $this")
    }
    println("CoroutineScope = $this")
    job.join()
}

suspend fun getMessageOne():String{
    delay(1000)
    println("After working in getMessageOne ")
    return "Hello "
}
suspend fun getMessageTwo():String{
    delay(1000)
    println("After working in getMessageTwo ")
    return "World"
}

