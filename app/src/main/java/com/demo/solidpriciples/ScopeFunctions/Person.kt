package com.demo.solidpriciples.ScopeFunctions

class Person {
    var name = "Meera Potdar"
    var age = 32

  /*  var name :String? =null
    var age :Int? = null*/
}

fun main(args:Array<String>){
//Regular aproch to call object
   /* val person = Person()
    person.name
    person.age
    println("Persons Name ="+person.name)
    println("Persons Age ="+person.age)*/

    //apply
    val person = Person().apply {
        this.name ="Meenal Kapoor"
        this.age = 60
    }
  val bio = with(person){
       println("Here is the Name of person = "+this.name)
       println("Here is the age of person = "+this.age)
      age + 5
   }
    println("Age after change = $bio")

    person.also {
        it.name = "Meera Kumar Swami"
        println("There is change in persons name = ${it.name}")
    }

    Person().let {
       person ->
       println("Here is the person after applying let " +person.name)
       println("Here is the person after applying let " +person.age)
   }


    //with
    val numberList :MutableList<Int> = mutableListOf(1,2,3)
   val duplicateNo = numberList.also {
        println("Print the number $it")
        numberList.add(4)
        println("After Updating list of numbers $it")
        numberList.remove(2)
        println("Print the number after deleting $it")
    }
    println("Duplicate  number $duplicateNo")
    println("Origenal the number $numberList")

    val company :String? = "Capgemini"

   val companyLenght = company?.let {
        println(it.reversed())
       println(it.uppercase())
       it.length
    }

    println("Hey this the lenght = $companyLenght")

    val person2:Person? = Person()

    val personDetails = person2?.run {
        println(this.name)
        println(this.age)
        age + 20
        "He is a mad at me"
    }

    println("Here is Person Details $personDetails")

}