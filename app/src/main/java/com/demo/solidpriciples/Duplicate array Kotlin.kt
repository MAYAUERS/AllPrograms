package com.demo.solidpriciples

fun main(){
    var array = arrayOf(1,1,2,4,2)
    var duplicateSet:MutableSet<Int> = mutableSetOf()

    for (i in 0..(array.size-1)){
        if (!duplicateSet.contains(array[i])){
            duplicateSet.add(array[i])
        }
    }
    println("Duplicate Array = $duplicateSet")
}