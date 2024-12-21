package com.demo.solidpriciples

fun main(){
   /* var counter = 1
    for (i in 1..5){

        for (j in 1..i){
            print(" $counter ")
            counter += 1
        }
        println()
    }*/
    var counter = 1
    for(i in 1..5){
        for(j in 1..i){
            print(" $counter ")
            counter++
        }
        println()
    }
}

/*
Output
 1
 2   3
 4   5   6
 7   8   9   10
 11  12  13  14  15
*/
