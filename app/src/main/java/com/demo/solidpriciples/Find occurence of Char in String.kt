package com.demo.solidpriciples

fun main(){

    val inputStr = "Meera"
    val char = 'e'
    var frequency = 0

    for(i in 0..inputStr.length -1){
        if (char == inputStr[i]) {
            frequency++
        }
    }
    println("Occurence of e in $inputStr is = $frequency")

        //................................................
    val nameStr = "MeeraPotdar"

    val charC = 't'
    var frequency1 = 0

    for (i in 0.. nameStr.length - 1 ){
        if (charC == nameStr[i]){
            frequency1++
        }
    }
    println("Occurence of r in $nameStr is = $frequency1")







    var name = "KomalShah"
    val searchChar = 'k'
    var frequencyOfChar = 0

    name = name.lowercase()
    for (i in 0..name.length - 1){
        if (searchChar == name[i]){
            frequencyOfChar ++
        }
    }
    println("Occurence of Char in $name = $frequencyOfChar")





val inputString = "MeeraPotdar"
val charSearch = 'r'
var frequencyN = 0

for (i in 0..inputString.length -1) {
    if (charSearch == inputString[i]){
        frequencyN ++
    }
}
println("$frequencyN")























}