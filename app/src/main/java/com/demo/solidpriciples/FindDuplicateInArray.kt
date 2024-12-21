package com.demo.solidpriciples

fun main() {

    val values =intArrayOf(1,2,3,3,2,5,6,7,8)
    val duplicate = duplicateArray(values)
    println(duplicate)
}

fun duplicateArray(array:IntArray):Set<Int>{

    val mutableSetofInt:MutableSet<Int> = mutableSetOf()
    val duplicateArray:MutableSet<Int> = mutableSetOf()

    for (i in array){
        if (!mutableSetofInt.add(i)){
            duplicateArray.add(i)
        }
    }
    return duplicateArray

}