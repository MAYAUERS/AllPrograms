package com.demo.solidpriciples

fun main(){

    val inputString = "Meera"
    val characterHashMap = HashMap<Char,Int>()
    var char:Char
    for (i in inputString.indices){
        char = inputString[i]

        if (characterHashMap.containsKey(char)){
            characterHashMap[char] = characterHashMap[char]!!+1
        }else{
            characterHashMap[char] = 1
        }
    }

    println("All characters in Meera are = $characterHashMap")
}

//output
/*All characters in Meera are = {a=1, r=1, e=2, M=1}*/
