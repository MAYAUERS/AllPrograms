package com.demo.solidpriciples.Inheritance


fun main(){

    val dog = Dog()
    dog.bread
    dog.color
    dog.bark()
    dog.eat()
    println("color of Dog = "+dog.color)
   /* println("bread of Dog = "+dog.bread)
    println("color of Dog = "+dog.color)*/

    val cat = Cat()
    cat.age = 4
    cat.color = "White"
    cat.meow()
    cat.eat()
   /* println("bread of Dog = "+cat.age)
    println("color of Dog = "+cat.color)*/

  /*  val animal = Animal()
    animal.color = "Blue"*/
  //  animal.eat()
   // println("color of Dog = "+animal.color)


}
open class Animal:Test{

    open var color:String = "Red"

    override fun eat(){
        println("Animal is eating")
    }

}