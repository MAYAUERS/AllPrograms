package com.demo.solidpriciples

fun main()
{
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))

    val names = listOf("Alice", "Bob", "Charlie")
    val answers = listOf(58, 29, 78)

    val result = names.zip(answers) { name, answer ->
        "$name wrote $answer answers"
    }

    println(result)

    val listA = listOf("a", "b", "c")
    val listB = listOf(1, 2, 3, 4)
    println(listA zip listB)

    var list1 = listOf(1,2,3,4)
    var list2 = listOf("Meera","Santosh","Suraj","Priya")

    println(list1.zip(list2))

    println(colors.zip(animals) { color, animal ->
        "The ${animal.replaceFirstChar { 
            it.uppercase() }} is $color"
           }
    )

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}