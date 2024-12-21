package com.demo.solidpriciples.SRP

data class EmployeeDetail(val employee: Employee,
                          val employeeCTC: EmployeeCTC,
                          var employeeAddress: EmployeeAddress
){

    fun getEmployee(){
        employee.getEmpBasicInformation()
    }

    fun getEmployeeCTC(){
        employeeCTC.getEmpCTCInformation()
    }

    fun getEmployeeAddress(){
        employeeAddress.getEmpAddressInformation()
    }

}

fun main(args: Array<String>){
    val employee = Employee("1","Name","3256787654")
    val employeeCTC = EmployeeCTC("1","Name","3256787654")
    val employeeAddress = EmployeeAddress("1","Name","3453","Pune","maharastra")

    val employeeDetail =EmployeeDetail(employee = employee, employeeCTC = employeeCTC,employeeAddress =employeeAddress)
    employee.getEmpBasicInformation()
    employeeAddress.getEmpAddressInformation()
    employeeCTC.getEmpCTCInformation()
    println(employeeDetail)
}