package com.demo.solidpriciples.DIP

class GooglePay:Payment {
    override fun pay(amount: Double) {
        println("Processing googlepay Payment= $amount")
    }
}