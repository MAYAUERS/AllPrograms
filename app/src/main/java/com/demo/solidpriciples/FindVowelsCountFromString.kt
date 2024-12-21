package com.demo.solidpriciples

fun main(){

    var str = "Meera Potdar 999"

    var vowels = 0
    var consonant = 0
    var digit = 0
    var space = 0

    str = str.lowercase()
    for(i in 0..str.length - 1){
        val ch = str[i]
        if(ch =='a'||ch =='e' ||ch =='o' ||ch =='i' ||ch =='u'){
            ++vowels
        }else if (ch in 'a'..'z')
        {
            ++consonant
        }else if(ch in '0'..'9'){
            ++digit
        }else if (ch == ' '){
            space++
        }
    }

    println("Vowels = $vowels")
    println("Consonant = $consonant")
    println("Digit = $digit")
    println("Space = $space")
}