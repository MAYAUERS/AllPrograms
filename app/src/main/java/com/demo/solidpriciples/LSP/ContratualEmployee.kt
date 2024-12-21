package com.demo.solidpriciples.LSP

class ContratualEmployee:Employee() {

    override fun calculateSalary(): Int {
        return 80000
    }

    override fun calculateBonus(): Int {
        return throw Exception()
    }
}