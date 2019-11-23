package com.udacity.kotlin.generics

import com.udacity.kotlin.Aquarium

open class WaterSupply(var needsProcess: Boolean) {
}


class LakeWater : WaterSupply(true) {

    fun needsFilter() {
        needsProcess = false
    }
}

class FishStoreWater : WaterSupply(false) {
}

class TapWater : WaterSupply(true) {

    fun addChemicalCleaners() {
        needsProcess = false
    }
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        println(waterSupply.addChemicalCleaners())
    }
}

fun addItem1(acquarium: Acquarium<WaterSupply>) = println("item added")
fun addItem2(acquarium: Acquarium<WaterSupply>) = 34

fun genericExample() {
    val acquariumTapWater =
        Acquarium<TapWater>(TapWater()) // OR  val acquariumTapWater:Acquarium<TapWater> = Acquarium<TapWater>
    acquariumTapWater.waterSupply.addChemicalCleaners()
    val acquariumLakeWater =
        Acquarium<LakeWater>(LakeWater())// OR  val acquariumLakeWater: Acquarium<LakeWater> = Acquarium<LakeWater>
    val acquariumFishStoreWater =
        Acquarium<FishStoreWater>(FishStoreWater())// OR val acquariumFishStoreWater: Acquarium<FishStoreWater> = Acquarium<FishStoreWater>

    val acquariumString: Acquarium<String> = Acquarium("string")
    println(acquariumString.waterSupply)

    val acquariumNull: Acquarium<Nothing?> = Acquarium(null)
    println(acquariumNull.waterSupply)


    val acquarium: Acquarium<WaterSupply> = Acquarium(TapWater())
    addItem1(acquarium)

    val tapWaterCleaner = TapWaterCleaner()

}

fun main() {
    genericExample()
}