package com.demo.solidpriciples

fun main(){


    println("Sum of two numbers = ${add(3,6)}")
    println("Mul of two numbers = ${mul(30,6)}")
    println("lambda1 result = ${lambda1(4)}")
    println("lambda2 result = ${lambda2("Hi","Meera")}")

}

var add = {a:Int,b:Int -> a+b}

var mul:(Int,Int)->Int = {x,y -> x * y}

val lambda1:(Int)->Int= {a ->  a * a}
val lambda2 :(String,String)->String = {a,b -> a + b}