package com.demo.solidpriciples

fun main() {

    val list = listOf(1 , 2, 3, 4, 5)

    val evenList = mutableListOf<Int>()
    val oddList = mutableListOf<Int>()

    for(item in list){
        if(item % 2 == 0){
            evenList.add(item)
        } else {
            oddList.add(item)
        }
    }
    val multiplybytwo = evenList.map { it * 2 }
    println(multiplybytwo)
    println(evenList)
    println(oddList)


    ///////////////
    val list1 = listOf(1 , 2, 3, 4, 5)
    val (even, odd) = list1.partition { it % 2 == 0}

    println(even)
    println(odd)



    /////////
    val list2 = listOf<Int>(1,2,3,4,5,6)

    val oddNumList = mutableListOf<Int>()
    val evenNumList = mutableListOf<Int>()

    for (item in list2){
        if (item % 2 == 0){
            evenNumList.add(item)
        }else{
            oddNumList.add(item)
        }
    }
    println("Odd Numbers from List $oddNumList")
    println("Even Numbers from List $evenNumList")
}