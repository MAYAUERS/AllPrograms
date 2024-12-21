package com.demo.solidpriciples.collections

fun main(){

    //Immutable list
   /* val names = listOf<String>("Meera","Rakesh","Pavan","Surya","Ajay","Aditya")
    print(names)

    val names = buildList<String> {
        add("Meera")
        add("Rakesh")
        add("Pavan")
        add("Surya")
        add("Adi")
    }
    print(names)*/

    //Mutable List
//    val names = mutableListOf<String>("Meera","Rakesh","Pavan","Surya","Ajay","Aditya")
//    names.add("Priya")
//    names.add("Siya")
//    names.add(4,"Harish")
//    //print(names)
//    for (name in names){
//        println(name)
//    }
//  //  names.forEach { println(it) }

    //Mutable Set
//    val names = mutableSetOf<String>("Meera","Rakesh","Pavan","Surya","Ajay","Aditya")
//    names.add("SuPriya")
//    names.add("SiyaRam")
//    names.add("SuPriya")
//    print(names)

//Immutable set
//    val names = setOf<String>("Meera","Rakesh","Pavan","Surya","Ajay","Aditya","Meera")
//    print(names)

//    val names = buildSet<String> {
//        add("Suriya")
//        add("Ramya")
//    }
//    print(names)

    //Mutable Map
    val names = mutableMapOf<String,String>("Meera" to "CG","Rakesh" to "TCG","Pavan" to "TCS","Surya" to "CapG","Ajay" to "Bitwise")
    names.put("Haritha","JW")
    names.put("Mayur","CH")
    names.put("Haritha","J")
    names.put("Mita","CH")
//    for (item in names){
//        println("${item.key} => ${item.value}")
//    }
//    for ((key,value ) in names){
//        println("$key => $value")
//    }
//    names.forEach({k,v->
//        println("$k => $v")
//    })
    names.forEach{
        println("${it.key} -> ${it.value}")
    }
    //println(names)

    //Immutable map
//    val names = mapOf<String,String>("Meera" to "CG","Rakesh" to "TCG","Pavan" to "TCS","Surya" to "CapG","Ajay" to "Bitwise")
//    println(names)

//    val names = buildMap<String,String>{
//        put("Haritha","JW")
//        put("Mayur","CH")
//        put("Meenal","TCS")
//        put("Meenal","YCM")
//    }
//   println(names)

}