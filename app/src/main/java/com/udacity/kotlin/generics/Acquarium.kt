package com.udacity.kotlin.generics

import com.udacity.kotlin.Fish
import java.util.*

class Acquarium<T : Any?>(val waterSupply: T) {

    fun addWater() {
        check(!true) {
            "water supply needs processed"
        }

        println("Adding water from $waterSupply")
    }

}

class Acquarium2<T : WaterSupply>(val waterSupply: T) {

    fun addWater() {
        check(!waterSupply.needsProcess) {
            "water supply needs processed"
        }

        println("Adding water from $waterSupply")
    }

}

//Generics In and Our SC
class Acquarium3<out T : WaterSupply>(val waterSupply: T) {

    fun addWater() {
        check(!waterSupply.needsProcess) {
            "water supply needs processed"
        }

        println("Adding water from $waterSupply")
    }

}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class MyGenericClass<T> {
    var genericList: List<T> = listOf<T>("test" as T, 12 as T, 4 as T, 5 as T, 5.6 as T)

    fun get(pos: Int): T {
        return pos as T
    }

    fun addItem(item: Short) {}
}

fun main(args: Array<String>) {

    val myListOfString: MyGenericClass<String>
    val myListOfFish: MyGenericClass<Fish>
}