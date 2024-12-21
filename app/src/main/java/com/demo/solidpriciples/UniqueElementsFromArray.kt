package com.demo.solidpriciples

fun main(){

    val uniqueArray = arrayOf(1,2,3,2,1)
    val uniqueElement = findUniqueElements(uniqueArray)

    if(uniqueElement !=null){
        println("Unique Elements = $uniqueElement")
    }else{
        println("No unique values are present")
    }
}

fun findUniqueElements(array:Array<Int>): Int? {
    /*val grouped = array.groupBy{it}
    println("$grouped")
    return grouped.entries.find { it.value.size == 1 }?.key*/

    var unique = 0
    for (element in array) {
        unique = unique xor element
    }
    return unique
}