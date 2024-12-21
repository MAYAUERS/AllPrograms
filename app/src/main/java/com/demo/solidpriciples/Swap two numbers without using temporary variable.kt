package com.demo.solidpriciples

fun main(){

    var firstNo = 20
    var secondNo = 10

    println("Before Swapping")
    println("FirstNumber = $firstNo")
    println("SecondNumber = $secondNo")

    firstNo = firstNo - secondNo
    secondNo = firstNo + secondNo
    firstNo = secondNo - firstNo

    println("After Swapping")
    println("FirstNumber = $firstNo")
    println("SecondNumber = $secondNo")

    println(".........................................................")

    var firstNum = 30
    var secNum = 40

    println("Before Swapping")
    println("FirstNumber = $firstNum")
    println("SecondNumber = $secNum")

    firstNum = firstNum - secNum
    secNum = firstNum + secNum
    firstNum = secNum - firstNum

    println("After Swapping")
    println("FirstNumber = $firstNum")
    println("SecondNumber = $secNum")


}