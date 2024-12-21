package com.demo.solidpriciples

fun main(){

   /*val str = "TejasPotdar"
   val char = 'e'
   var frequency = 0
   for (i in 0..str.length - 1){
       if (char == str[i]){
           frequency++
       }
   }
   println("Frequency of $char is $frequency")*/

  /*  val str = "Meera"
    var reverseStr = ""

    for(i in str.length -1 downTo 0){
        reverseStr += str[i]
    }
    println("Reverse String is = $reverseStr")*/

    /*val first = 10
    val sec = 20
    val third = 30

    val largest = if(first >sec && first >third){
        first
    } else if(sec >third) {
        sec
    }else{
        third
    }

    println("Largest Number = $largest")*/

    //convert char array to string
    /*val charArray = charArrayOf('i','n','d','i','a')
    for (i in charArray.indices){
        println(charArray[i])
    }
    println("Print all char from array = ${charArray.contentToString()}")
    val strFromArray = String(charArray)
    println("String converted from char Array = $strFromArray")
*/
    //convert string to char array
    /*val str = "Meera"
    val charArray1 = str.toCharArray()
    println(charArray1.contentToString())*/

    val str = "MeeraPotdar"
    val charMap: MutableMap<Char, Int> = mutableMapOf<Char,Int>()
    var char:Char
 /*   for (i in str.length - 1 downTo 0){
        val char = str[i]

        if (charMap.contains(char)){
            charMap[char] = charMap[char]!!+1
        }else{
            charMap[char] = 1
        }
    }
   println("Char in $str is  = $charMap")
*/
    for (i in str.indices){
        char = str[i]

        if (charMap.contains(char)){
            charMap[char]= charMap[char]!!+1
        }else{
            charMap[char] =1
        }
    }
    println(charMap)
}