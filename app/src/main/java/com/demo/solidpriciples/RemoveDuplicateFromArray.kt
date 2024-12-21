package com.demo.solidpriciples

fun main(){

   val array = arrayOf(2,4,5,6,5,4,3,2,3,2)
   val removeDuplicate:MutableSet<Int> = mutableSetOf()

   for (i in 0 .. (array.size -1)) {
       if (!removeDuplicate.contains(array[i])){
           removeDuplicate.add(array[i])
       }
   }
    print(removeDuplicate)


    val array1 = arrayOf(1,1,3,4,5,6,2,3,6)
    val removeDuplicateArray1:MutableSet<Int> = mutableSetOf()

    for (i in 0..(array1.size -1)){
        if (!removeDuplicateArray1.contains(array1[i])){
            removeDuplicateArray1.add(array1[i])
        }
    }
    println(removeDuplicateArray1)
}

