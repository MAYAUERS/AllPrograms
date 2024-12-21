package com.demo.solidpriciples

import java.util.Date

fun main(){

    var str1:String = "Hey Meera, "
    var str2:String = "Hello "
    var str3:String = "There "
    var str4:String = "Hope you "
    var str5:String = "Doing Great? "

    val myDetails = str1.addStr(str2,str3,str4,str5)
    println(myDetails)

    fun Circle.perimeter():Double{
        return 2*Math.PI *radius
    }

    val circle = Circle(2.5)
    circle.perimeter()
    circle.area()
    println( circle.perimeter())
    println( circle.area())

    var age = AgeState()
    println("Im adult= "+age.isAdult(26))

    fun AgeState.isBabyChild(age: Int):Boolean{
        if (age > 0 && age< 3){
            return true
        }else{
           return false
        }
    }
    println("Im baby child = "+age.isBabyChild(2))

    val a = 20
    val b = 50

    val result = a greaterValue b
    println("Greater Value = $result")

    val resultStr = "Hello Everyone"
   val getlatest = resultStr.removeCharacterFromString()
    println(getlatest)

    var x = 20
    var resultof = x.addition(50)
    println(resultof)

    var today = Date()
    var futureDate = today.futureDate()
}

infix fun Int.greaterValue(x:Int):Int{
    return if(this > x){
        this
    }else{
        x
    }
}
fun String.addStr(s2:String,s3:String,s4:String,s5:String):String{
    return this + s2 + s3 + s4 +s5
}

class Circle(var radius:Double){
    fun area():Double{
        return Math.PI * radius * radius
    }
}


class AgeState(){
    fun isAdult(age:Int):Boolean{
        if(age > 18){
            return true
        }else{
            return false
        }
    }
}

//Remove last and first character from string using extension fun
fun String.removeCharacterFromString():String{

    return this.substring(1,this.length-1)
}

fun Int.addition(otherNumber:Int):Int{
    return this + otherNumber
}

fun Date.futureDate():Boolean{
    return this > Date()
}
