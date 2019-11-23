package com.udacity.kotlin.lamdas

class LamdaClass(val name: String) {
}

fun main(args: Array<String>) {
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(40))

    val listOfLambdas = listOf(LamdaClass("Fish"), LamdaClass("Bear"), LamdaClass("Hunter person"))
    println(listOfLambdas.filter { it.name.contains("un") }.joinToString() {
        it.name
    })
}