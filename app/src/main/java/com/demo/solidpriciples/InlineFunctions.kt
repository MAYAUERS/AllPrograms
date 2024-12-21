package com.demo.solidpriciples

fun main(){
    someHigerOrderFun {
        println(it)
    }
    someHighOrderFunction(
        someLambda = { },
        heavyHandedLambda = {
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
            println("")
        }
    )

  /*  someHighOrderFunction(someLambda = { println("Calling Lambda fun inside higherorder") }){
        anotherHigherOrderFunction { println("Another higherorder fun") }
    }*/

}
inline fun someHighOrderFunction(someLambda: (String) -> Unit, noinline heavyHandedLambda: () -> Unit) {
    someLambda("")
    heavyHandedLambda()
}

inline fun someHigerOrderFun(lmd:(String)->Unit){
    lmd("Some lmd called")
}

inline fun someHighOrderFunction(crossinline someLambda: (String) -> Unit) {

    anotherHigherOrderFunction {
        someLambda("") //This is not allowed.
    }
}

fun anotherHigherOrderFunction(anotherLambda:() -> Unit) {
    anotherLambda()
}