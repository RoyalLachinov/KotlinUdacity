package com.udacity.kotlin

open class FishHouse(width: Int, height: Int, lenght: Int) {
    // Class Constructor lesson

    constructor() : this(23, 23, 23) {}
    constructor(price: Double) : this(23, 23, 23) {}

    val width: Int = width;
    val height: Int = height;
    val lenght: Int = lenght;

    fun calculate() {
        println(width + height + lenght)
    }

    constructor(width: Int) : this(23, 23, 23) {
        println(width)
    }

    init {
        println("Init function works just like Consturctor but before any secondary Consturctor")
    }

    init {
        println("Print width: ${width}")
    }

    open var wd: Int = width
}

fun main(args: Array<String>) {
    val myFishHouse1 = FishHouse(20, 30, 40);
    val myFishHouse2 = FishHouse(width = 20, height = 30, lenght = 40);
    myFishHouse1.calculate()
    myFishHouse2.calculate()

    FishHouse(55);
    //println(myFishHouse3)

}