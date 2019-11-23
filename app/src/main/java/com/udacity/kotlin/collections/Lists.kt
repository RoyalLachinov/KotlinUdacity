package com.udacity.kotlin.collections

class Lists {
}

fun main(args: Array<String>) {
    val listOfDigits = listOf(23, 34, 4, 35, 53, 12, 12, 54, 768, 12, 35)
    println(listOfDigits.reversed())
    println(listOfDigits.asReversed())

    val symptoms: MutableList<String> =
        mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    println(symptoms)
    symptoms.add("blue spots")
    println(symptoms)
    println(symptoms.subList(3, symptoms.size))
    println(listOf(2, 4, 4).sum())
    println(listOf("acv", "b", "cc").sumBy { it.length })
    val equipment2: Map<String, String> =
        mapOf("fishnet" to "catching fish", "my fish" to " or your fish")
    println(equipment2)
    println(equipment2.getOrDefault("keyTest", "valueTest"))
    println(equipment2.getOrElse("keyElse") {
        "No default else value"
    })

    val inventory: MutableMap<String, Int> = mutableMapOf("fish net" to 1)
    println(inventory)
    inventory.put("fish subnet", 3)
    println(inventory)
    inventory.remove("fish net")
    println(inventory)

}