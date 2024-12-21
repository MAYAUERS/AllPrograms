package com.demo.solidpriciples

fun main(){
    val num = 5
    val isPrimNumber = isPrime(num)
    if (isPrimNumber){
        println("$num Number is prime")
    }else{
        println("$num Number is not prime")
    }

}

fun isPrime(num:Int):Boolean{

    if (num <= 1){
        return false
    }

    for (i in 2.. num/2){
        if (num % i == 0){
            return false
        }
    }
    return true
}