package com.demo.solidpriciples

import java.math.BigInteger

fun main(){

    println("${getFibonaciNumber(9, BigInteger.ONE,BigInteger.ZERO)}")

    println("${getFibonaciNum(4, BigInteger.ONE, BigInteger.ZERO)}")
}

tailrec fun getFibonaciNumber(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    return if (n == 0){
        b
    }else{
        getFibonaciNumber(n-1,a + b , a)
    }
}




///............................................................

fun getFibonaciNum(num:Int,  x:BigInteger , y:BigInteger):BigInteger{
    if (num == 0){
        return y
    }else{
        return getFibonaciNum(num - 1 , x + y , x)
    }
}