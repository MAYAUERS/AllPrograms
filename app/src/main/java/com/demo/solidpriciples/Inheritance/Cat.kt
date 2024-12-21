package com.demo.solidpriciples.Inheritance

class Cat:Animal(){

    var age:Int = -1
    override var color:String = ""
    fun meow(){
        println("Cat is meowing")
    }

    override fun eat(){
        println("Cat is eating")
    }
}