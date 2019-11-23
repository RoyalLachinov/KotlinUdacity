package com.udacity.kotlin.pairs

class PairClass {

}


fun giveMeATool(): Pair<String, String> {
    return ("fishnet" to "catching fish")
}

fun main(args: Array<String>) {
    val equipment1 = "fishnet" to "catching fish"
    println(equipment1.first)
    println(equipment1.second)
    val equipment2 = "fishnet" to "catching fish" to "my fish" to " or your fish"
    println(equipment2)
    println(equipment2.first)
    println(equipment2.first.first)
    val fishNet = "fishnet" to "catching fish"
    val (tool, use) = fishNet
    println("The $tool is a tool for $use")
    println(fishNet.toString())
    println(fishNet.toList())
    val (tool1, use1) = giveMeATool();
    println(tool1 + "  " + use1)
}