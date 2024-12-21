package com.demo.solidpriciples


fun main(){
  //  var student = Student("Meera")
    val student = Student("Meera",20)
    println("Id of the Student  = ${student.id}")
    // student.name = "Meera"

    //println("Name of the Student  = ${student.name}")
}

class Student(var name:String){
   // var name = "dummmy Name"
    var id:Int  = -1
    init {
        println("Name of the Student  = $name  , $id")
    }

    constructor(n:String,id:Int):this(n){
        this.id = id
    }

}