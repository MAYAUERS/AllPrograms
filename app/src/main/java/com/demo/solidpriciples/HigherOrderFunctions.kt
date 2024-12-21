package com.demo.solidpriciples

fun main(arg:Array<String>){

    higherOrder1(lambda)
    higherOrder2(add1)
    higherOrder3(::sub)
    val higher = higherOrder4()
    val result = higher(4,5)
    println(result)
    hi(additionOfTwoNumbs)

    val mul = higherOrder6()
    val res = mul(4,5)
    println("Return Fun from higherorder fun = $res")
}

var lambda = {println("GeeksforGeeks: A Computer Science portal for Geeks") }

fun higherOrder1(lmd: () -> Unit){
    lmd()
}


var add1:(Int,Int)->Int = {a,b -> a + b}

fun higherOrder2(add:(Int,Int) -> Int){
    val result = add(3,6)
    println(result)
}
fun higherOrder3(substraction:(Int,Int) ->Int){
    val result = substraction(30,4)
    println(result)
}
fun higherOrder4():(Int,Int)->Int {
    return ::mul
}
fun sub(a:Int,b:Int):Int{
    return a - b
}

fun mul(x:Int,y:Int):Int {
    return x * y
}

var additionOfTwoNumbs = {a:Int,b:Int -> a + b }

fun hi(myfun: (Int,Int)->Int){
    val result = myfun(2,4)
    println("Result of Higherorder fun = $result")
}

fun multiplication(a:Int,b:Int):Int = a * b

fun higherOrder6():((Int,Int) -> Int){
    return ::multiplication
}