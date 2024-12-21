package com.demo.solidpriciples

fun main(){

   /* val num = 10
    var n1 = 0
    var n2 = 1
    println("The number is defined as: $num")
    println("The Fibonacci series till $num terms:")

    for(i in 1..num){
        println(n1)
        val sum  = n1 + n2
        n1 = n2
        n2 = sum
    }*/


    /*
    val number = 5
    var n11 =0
    var n22 = 1

    println("Number define for fibonacci $number")
    println("fibonacci series till number $number")
    for (i in 1..number){
        println(n11)
        val summ = n11 + n22
        n11 = n22
        n22 = summ
    }
*/
    /////////////////

/*    println("\n \n ")
    val a = 10
    var t1 = 0
    var t2 = 1

    println("Fibonaci series till $a")

    for (i in 1..a){
        println(t1)
        val sum1 = t1 + t2
        t1 = t2
        t2 = sum1
    }
    println("Fibonaci series = $a")*/

  //  fibo(5)

    /*var n11 = 0
    var n22 = 1
    val number  = 5
    println("Fobonaci series till $number ")
    for (i in 1..number){
        println(n11)
        val sum = n11 + n22
        n11 = n22
        n22 = sum
    }*/
    fibo(10)
    var n11 = 0
    var n22 = 1
    val number = 5
    for (i in 1..number)
    {
        print(n11)
        val sum  = n11 + n22
        n22 = n11
        n11 = sum
    }
   // print("Fobonaci = $number")
}

fun fibo(num : Int){
    var n1 = 0
    var n2 = 1

    for (i in 1..num){
        print(n1)
        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
    println("Fobonaci = $num")

    //////..........................................................
    println("............................................................")



}