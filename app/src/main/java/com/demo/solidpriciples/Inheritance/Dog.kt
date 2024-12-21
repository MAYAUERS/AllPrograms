package com.demo.solidpriciples.Inheritance

class Dog:Animal() {

    var bread:String =""
    override var color:String = "Black"

    fun bark(){
        println("Dog is barking")
    }
    override fun eat(){
        super<Animal>.eat()
        println("Dog is eating")
    }
}