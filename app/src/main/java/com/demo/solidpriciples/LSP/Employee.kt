package com.demo.solidpriciples.LSP

open class Employee {

    open fun calculateSalary():Int {
        return  100000
    }

   open fun calculateBonus():Int{
        return 10000
    }
}


fun main(args: Array<String>) {
    val employee = Employee()
    val permanentEmployee = PermanentEmployee()
    val contratualEmployee =ContratualEmployee()


    println(employee.calculateBonus())
    println(employee.calculateSalary())
    println(permanentEmployee.calculateBonus())
    println(permanentEmployee.calculateSalary())

   // println(contratualEmployee.calculateBonus())
    println(contratualEmployee.calculateSalary())

}