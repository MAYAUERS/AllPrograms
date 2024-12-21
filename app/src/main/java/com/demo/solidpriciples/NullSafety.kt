package com.demo.solidpriciples

fun main(){

    //basic check cast check
   /* val name:String? ="Yash"
    if (name !=null){
        println(name.length)
    }else{
        println("length is null")
    }
    println(name)*/

    //safe cast check
     val name:Any? ="Yash"
    if (name is String){
        println(name.length)
    }else{
        println("length is null")
    }
    println(name)

    //nulable reference
  /*  var name:String? ="Yash"
    name = null
    println(name)*/

    //unsafe cast
   /* val name:Any? = "Meera"
    val subName:String? = name as? String
    println(subName)
*/
    //elvis operator
  /*val name:String? = "Meera"
  val len = name?.length?:-1
  println(len) */
}