package com.demo.solidpriciples

fun main(){

    val ch = 'z'

    when(ch){
        'a','o','e','i','u','A','O','E','I','U' -> println("$ch is vowel")
        else -> println("$ch is Consonant")
    }


    val charC = 'e'

    when(charC){
        'a','o','u','e','i','A','O','E','I','U' -> println("$charC is vowel")
        else -> println("$charC is consonant")
    }
}

