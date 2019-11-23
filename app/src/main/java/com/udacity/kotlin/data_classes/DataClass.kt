package com.udacity.kotlin.data_classes

data class DataClass(val rocks: String) {
}

data class DataClass2(val rocks: String, val wood: String, val driwer: String) {}

fun makeDecarations() {
    val d1 = DataClass("granite")
    println(d1)

    val d2 = DataClass("sand")
    println(d2)

    val d3 = DataClass("sand")
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4 = d3.copy()
    println(d3)
    println(d4)

    val d5 = DataClass2("sand", "wood", "driver")
    println(d5)

    val (rock, wood, driver) = d5
    println(rock + "   " + wood + "  " + driver)
}


fun main() {
    makeDecarations()
}