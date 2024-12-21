package com.demo.solidpriciples.collections

fun main(){

    var peple = listOf<Person>(
        Person("Meera","Potdar","Indian",32),
        Person("Vidya","Gure","Indian",31),
        Person("Priya","Jire","Pakistan",55),
        Person("Teena","Bithe","Indian",22)
    )

    var transforemedList = peple.mapNotNull{ if (it.nationality !== "Pakistan") it.firstName else null}
    println(transforemedList)

    var cityStates = buildMap<String,String> {
        put("Mumbai","Maharastra")
        put("Banglore","Karnataka")
        put("Panjim","Goa")
        put("Chennai","Tamil Nadu")
    }
    print(cityStates.mapKeys { it.key.uppercase() })

    println(".............................................................")
   var city = listOf<String>("Mumbai","Pune","Thane","Lonawala")
    var zippedCity = city.zip(peple)
    println(zippedCity)
    println(zippedCity.unzip().first)
    println(zippedCity.unzip().second)
    println(".............................................................")

    //association
    var associateList = peple.associate { it ->Pair(it.firstName+it.lastName+it.age,it) }
    associateList.forEach { first,second-> println("${first} ->${second}") }

    //flatten
    val list1 = listOf<String>("Meera","Rakesh","Teena","Ira")
    val list2 = listOf<String>("Karnataka","Maharastra","Goa","TamilNadu")
    val list3 = listOf<String>("Pune","Mumbai","Thane","Kolhapur")

    var flattenList = listOf<List<String>>(list1,list2,list3)
    println(flattenList.flatten())

    //String Presentation

    println(city.joinToString(separator = "|", prefix = "Start here: ", postfix = "Ends here"))
}