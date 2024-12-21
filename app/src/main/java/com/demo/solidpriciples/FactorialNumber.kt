package com.demo.solidpriciples

import java.math.BigInteger


fun main(){
    val input = 5
    var myResult = 1

    for(i in 1..input){
        myResult *= i
    }

    println("Factorial of $input = $myResult")
    fact()
    factNumbers()
}



fun fact(){
    val fact = 5
    var num = 1

    for (i in 1..fact){
        num *= i
    }

    println(num)
    factorical()
    println("Factorial of Recurecive fun - ${factoRecurcive(4)}")
}



fun factorical(){
    var factorial = 5
    var num = 1

    for (i in 1..factorial){
        num *= i
    }
    println("Factorial = $num")
}


fun factNumbers(){
    var num = 1
    var inputNo = 4

    for (i in 1..inputNo){
        num *= i //1*2*3*4
    }
    println("Factorial of $inputNo = $num")
}

fun factoRecurcive(num :Int):Long{
    return if ( num == 0 || num == 1){
        1L
    }
    else{
       num * factoRecurcive( num -1)
    }
}






