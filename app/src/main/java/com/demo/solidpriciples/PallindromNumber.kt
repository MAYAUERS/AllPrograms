package com.demo.solidpriciples

fun main(){

    /*var num = 121

    var reverse = 0
    val temp = num
    while (num !=0){
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }
    if (reverse == temp){
       println("Number is Palindrome")
    }else{
        println("Number is Not Palindrome")
    }*/


    var num = 121

    var reverse = 0

    val temp = num

    while (num != 0){
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }
    if(reverse == temp){
        println("Number is palindrome")
    }else{
        println("Number is Not Palindrome")
    }








var numberForPallindrom = 212
var reverseNumber = 0
val tempNum = numberForPallindrom

while (numberForPallindrom !=0){
    val digit = numberForPallindrom % 10
    reverseNumber = reverseNumber * 10 + digit
    numberForPallindrom /=10
}
 println("Reverse Number = $reverseNumber")
 if (reverseNumber == tempNum){
     println("Number is pallindrom")
 }   else{
     println("Number is not pallindrom")
 }






}