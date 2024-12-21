package com.demo.solidpriciples

import android.annotation.SuppressLint

fun main(){
    StringOccurenceOfEachElement()
    swapTwoNumbersN()
    getOddEvenFromList()

    val list = listOf("orange", "apple", "apple", "banana", "water", "bread", "banana")
    println(list.groupingBy { it }.eachCount().filter { it.value > 1 })

    var str = "Meera Pradip Potdar 9011500029"
    palindromeSubString()
    checkStringHasUniqueCharacters()
    printNumberOfWordsInString()
    calculateCharacters()
    pallindromNumber()
    reverseString()
    stringOccurence()
    swapTwoNumbers()
    swapWithTemporaryVeriable()
    var vowels = 0
    var consonant = 0
    var digit = 0
    var space = 0

    str.lowercase()
    for (i in 0..str.length -1){
        val char = str[i]
        if(char == 'i' || char == 'a' || char == 'o' || char == 'u' || char == 'e'){
            vowels++
        }else if (char in 'a'..'z') {
            consonant++
        }else if(char in '0'..'9'){
            digit++
        }else if (char == ' '){
            space++
        }
    }

    println(vowels)
    println(consonant)
    println(digit)
    println(space)

    val number = 5
    val isprime = isPrimeNumber(number)
    if (isprime){
        println("$number is prime")
    }else{
        println("$number is not prime")
    }
}

fun isPrimeNumber(num:Int) :Boolean{
    if(num >= 1){
        return false
    }
    for (i in 2 .. num/2){
        if (num % i ==0){
            return false
        }
    }
    return true
}

fun swapTwoNumbers(){
   var first = 50
   var second = 30

   first = first - second
   second = second + first
   first = second - first
    println("The Two swapping Nos are first no. =$first and second no. = $second")
}
fun swapWithTemporaryVeriable(){
    var first1 = 50
    var second1 = 30
    var temp1 = 0

    temp1 = first1
    first1 = second1
    second1 = temp1
    println("The Two swapping Nos are first no. =$first1 and second no. = $second1")
}

fun stringOccurence(){
    val inputString = "AjayVerma"
    val charHashMap = HashMap<Char,Int>()
    var char:Char
    for(i in 0..inputString.length -1)
    {
        char = inputString[i]
        if (charHashMap.containsKey(char)){
            charHashMap[char] = charHashMap[char]!!+1
        }else{
            charHashMap[char] = 1
        }
    }
    println("String occurence of $inputString = $charHashMap")
}
fun reverseString(){
    var str = "Meera"
    var reverse = " "

    for (i in str.length - 1 downTo  0){
        reverse += str[i]
    }
    println(reverse)
}
fun pallindromNumber(){

    var num = 121
    var reverse = 0
    var temp = num
    while (num !=0){
        var digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }
    if(reverse == temp){
        println("$temp no is pallindrome ")
    }else{
        println("$temp no is not pallindrome ")
    }
}

fun calculateCharacters(){
    val strInput = "Meera"
    val char ='e'
    var frequency = 0
    for (i in 0..strInput.length-1){
        if (char == strInput[i]){
        frequency ++
        }
    }
    println(frequency)
}

fun printNumberOfWordsInString(){
    val strInput = "Meera"
    var frequency = 0
    for (s in strInput){
        if (s != ' '){
            frequency ++
        }
    }
    println(frequency)
}

fun checkStringHasUniqueCharacters(){

    val str = "abcd"
    val characterSet = HashSet<Char>()
    var result = false
    for (i in str.indices){
        result = characterSet.add(str[i])
        if (!result)
            break
    }
    println("Unique charactesr = $result")
}

@SuppressLint("SuspiciousIndentation")
fun palindromeSubString(){

    val input = "babab"
    val palindromes = mutableListOf<String>()
    for (i in 0..input.length){
        for (j in i+1 ..input.length){
            var substring = input.substring(i,j)
            if (isPalindromeString(substring))
            palindromes.add(substring)
        }
    }
    println("Palindrome Substring are =")
    palindromes.forEach { println(it) }
}

fun isPalindromeString(str:String):Boolean{
    return str == str.reversed()
}

fun getOddEvenFromList(){
    var list = listOf<Int>(1,2,3,4,5,6,7,8,9)

    var odd = mutableListOf<Int>()
    var even = mutableListOf<Int>()

    for (item in list){
        if (item % 2 == 0){
            even.add(item)
        }else{
            odd.add(item)
        }
    }
    val multiplyeven = even.map { it * 2 }
    val multiplyodd = odd.map{it*2}

    println("Odd Numbers list = $odd")
    println("Even Numbers list = $even")
    println("Odd Numbers Multiply by 2  = $multiplyodd")
    println("Even Numbers Multiply by 2 = $multiplyeven")
}

fun swapTwoNumbersN(){
    var one = 40
    var two = 30

    one = one - two
    two = two + one
    one = two - one

    println("Swapining two no are first = $one second = $two")
}

fun StringOccurenceOfEachElement(){

    val input = "MeeraPotdar"
    val characterHashMap = HashMap<Char,Int>()
    var char :Char

    for (i in input.indices){
        char = input[i]
        if (characterHashMap.containsKey(char)){
            characterHashMap[char] = characterHashMap[char]!!+ 1
        }else{
            characterHashMap[char] = 1
        }
    }
    println("Characters in String = $characterHashMap")

}

