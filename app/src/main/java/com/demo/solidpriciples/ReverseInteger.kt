package com.demo.solidpriciples

fun main(){

 /*   var num = 12345
    var reverse = 0

    while(num !=0){
       val digit = num % 10
       reverse = reverse * 10 + digit
       num /= 10
    }
    println("Reverse Number = $reverse")*/













var num = 121
var reverse = 0
var temp = num
while (num!= 0){
    var digit = num % 10
    reverse = reverse * 10 + digit
    num /=10
}

    if (temp == reverse){
        println("Palindrome number = $reverse")
    }else {
        println("Not Palindrome number = $reverse")
    }










}