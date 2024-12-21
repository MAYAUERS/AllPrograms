package com.demo.solidpriciples

fun main(){

  val array = arrayOf(2,3,5,7,8,9)

  val array2 = arrayOfNulls<Int>(array.size)

  for(i in array.size -1 downTo 0){
      array2[(array.size - 1) - i] = array[i]
  }
    for(item in array2){
        print(" $item")
    }

    val array1 = arrayOf(1,2,3,4,5)

    val reverse = arrayOfNulls<Int>(array1.size)

    for (i in array1.size-1 downTo  0){
        reverse[(array1.size -1) - i] = array1[i]
    }
    for (i in reverse){
        println("$i")
    }





    val array11 = arrayOf(1,2,3,4,5,6)
    val reverseArray22 = arrayOfNulls<Int>(array11.size)

    for (i in array11.size -1 downTo 0){
        reverseArray22 [(array11.size -1) -i] = array11[i]
    }
    for (i in reverseArray22){
        print("$i")
    }















}