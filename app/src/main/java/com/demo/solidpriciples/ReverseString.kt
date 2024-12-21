package com.demo.solidpriciples

fun main(){

    var str = "Meera"
    var reverStr = ""
    for (i in str.length -1  downTo 0)
    {
        reverStr += str[i]
    }
    println(reverStr)









    val input = "MADAM"
    var reveres = ""
    val temp = input
    for (i in input.length -1 downTo 0){
        reveres += input[i]
    }
    if (reveres ==temp){
        println("palindrome")
    }else{
        println("Not palindrome")
    }
  //  println("Revers String = $reveres")














}