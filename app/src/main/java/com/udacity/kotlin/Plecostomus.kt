package com.udacity.kotlin

class Plecostomus : Fish(),FishAction by FishIntent{
    override val fishSize: Double
        get() = 23.5

    override val fishWeight: Double = 23.6

    open fun printThem(){
        println("fishSize is $fishSize and weight is $fishWeight")

    }

}

fun main(args: Array<String>) {
   val plecostomus =  Plecostomus()
    plecostomus.printThem()
    plecostomus.eat()

}