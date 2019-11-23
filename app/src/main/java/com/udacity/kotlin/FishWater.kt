package com.udacity.kotlin

open class FishWater : FishHouse() {

    override var wd = width;
    val hg = height;
    val lg = lenght;


}

fun main(args: Array<String>) {
    val myFishWater = FishWater();
    println(myFishWater.hg + myFishWater.wd + myFishWater.lg)
}