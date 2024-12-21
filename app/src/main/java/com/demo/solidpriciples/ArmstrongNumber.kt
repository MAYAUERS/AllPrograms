package com.demo.solidpriciples

import kotlin.math.pow

fun main(){

   // print(armstrongNum(153))
   // val number = 153//readLine()!!.toInt()
 println(armstrongNumber(153))
    am(153)
}

fun armstrongNum(number:Int){
    val length = number.toString().length
    var sum = 0
    var temp = number

    while (temp > 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(length.toDouble()).toInt()
        temp /= 10
    }
    if (number == sum) {
        println("$number is an Armstrong number.")
    } else {
        println("$number is not an Armstrong number.")
    }
}

fun armstrongNumber(number:Int){

    val length = number.toString().length
    var temp = number
    var sum = 0

    while(temp > 0 ){
        val digit = temp % 10
        sum += digit.toDouble().pow(length.toDouble()).toInt()
        temp /= 10
    }

    if (number == sum){
        println("$number is armstrong")
    }else{
        println("$number is Not armstrong")
    }
}



fun am(num:Int){

    val length = num.toString().length
    var temp = 0
    var sum = 0

    while ( temp > 0){
        val digit = temp % 10
        sum += digit.toDouble().pow(length.toDouble()).toInt()
        temp /=10
    }

    if (num == temp){
        println("Number is armstrong $num")
    }else{
        println("Number is not armstrong $num")
    }

}















