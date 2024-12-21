package com.demo.solidpriciples.DIP

class PaypalPayment:Payment {
    override fun pay(amount: Double) {
       println("Processing paypalPayment= $amount")
    }
}

fun main(args: Array<String>) {
    val paymentProcessor = PaymentProcessor(PaypalPayment())
    paymentProcessor.processPayment(100.0)

    val paymentProcessor1 = PaymentProcessor(GooglePay())
    paymentProcessor1.processPayment(200.0)

}