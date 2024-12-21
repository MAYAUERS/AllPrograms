package com.demo.solidpriciples

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import java.lang.IllegalStateException

fun main():Unit = runBlocking{
try {
    supervisorScope {

        val user = async { users() }
        val chat = async { rooms() }
        val configuration = async { config() }

        println(user.await())
        try {
            println(chat.await())
        } catch (e: Exception) {
            e.printStackTrace()
        }
        println(configuration.await())
    }
}catch (e:Exception){
    e.printStackTrace()
}
}

suspend fun users():List<User>{
delay(3000L)
    return listOf(User(1,"Meera"), User(2,"Shreya"))
}

suspend fun rooms():List<ChatRoom>{
    delay(2000L)
    throw IllegalStateException("Chat room not ready")
}

suspend fun config():AppConfig{
    delay(1500L)
    return AppConfig("App Config")
}

data class User(var id:Int,var name:String)
data class ChatRoom(var id:Int,var name:String)
data class AppConfig(var config: String)