package com.demo.solidpriciples.OCP.example2

class SavingAccount():CalculateInterest {
    override fun calculateInterest(account: Account): Double {
       return account.balance * 0.3
    }
}