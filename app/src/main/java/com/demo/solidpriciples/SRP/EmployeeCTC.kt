package com.demo.solidpriciples.SRP

data class EmployeeCTC(var empCtc: String,
                       var empTakeHome: String,
                       var empTax: String){
    fun getEmpCTCInformation(): String {
        return "EmployeeCTC(empCtc='$empCtc'," +
                " empTakeHome='$empTakeHome', " +
                "empTax='$empTax')"
    }
}
