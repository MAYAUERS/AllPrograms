package com.demo.solidpriciples.SRP

//OLD Implementation
/*
data class Employee(
    var empId: String,
    var empName: String,
    var empPhoneNumber: String,

    var empCtc: String,
    var empTakeHome: String,
    var empTax: String,

    var addressLine: String,
    var landmark: String,
    var pinCode: String,
    var city: String,
    var state: String
) {

    fun getEmpBasicInformation() {
        println("Emp Id: $empId")
        println("Emp name: $empName")
        println("Emp name: $empName")
        println("Emp PhoneNumber: $empPhoneNumber")
    }

    fun getEmpSalaryInformation() {
        println("Emp ctc: $empCtc")
        println("Emp take home: $empTakeHome")
        println("Emp tax: $empTax")
    }

    fun getEmpAddressInformation() {
        println("Emp address: $addressLine,$landmark,$city,$pinCode,$state")
    }

}*/

data class Employee(
    var empId: String,
    var empName: String,
    var empPhoneNumber: String){
    fun getEmpBasicInformation(): String {
        return "Employee(empId='$empId'," +
                " empName='$empName', " +
                "empPhoneNumber='$empPhoneNumber')"
    }
}