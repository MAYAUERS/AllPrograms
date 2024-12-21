package com.demo.solidpriciples.OCP.example1

class Addition : MathematicalOperation {
    override fun doCalculation(a: Int, b: Int): Int {
        return a+b
    }

}
fun main(args: Array<String>) {

    val math = Addition()
    math.doCalculation(30,50)
    println(math)

    val sub = Subtraction()
    sub.doCalculation(60,2)
    println(sub)
}