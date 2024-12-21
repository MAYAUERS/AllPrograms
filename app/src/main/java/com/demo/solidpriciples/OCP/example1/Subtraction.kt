package com.demo.solidpriciples.OCP.example1

import com.demo.solidpriciples.OCP.example1.MathematicalOperation

class Subtraction: MathematicalOperation {
    override fun doCalculation(a: Int, b: Int): Int {
       return a-b
    }
}