package com.demo.solidpriciples.SRP

data class EmployeeAddress(var addressLine: String,
                           var landmark: String,
                           var pinCode: String,
                           var city: String,
                           var state: String){
    fun getEmpAddressInformation(): String {
        return "EmployeeAddress(addressLine='$addressLine'," +
                " landmark='$landmark'," +
                " pinCode='$pinCode', " +
                "city='$city', state='$state')"
    }
}
