package com.demo.solidpriciples.LSP

class PermanentEmployee():Employee() {

    override fun calculateSalary(): Int {
        return 200000
    }
}