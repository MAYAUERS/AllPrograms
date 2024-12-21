package com.demo.solidpriciples.DIP

class PaymentProcessor(private val payment: Payment) {

    fun processPayment(amount:Double){
        payment.pay(amount)
    }
}