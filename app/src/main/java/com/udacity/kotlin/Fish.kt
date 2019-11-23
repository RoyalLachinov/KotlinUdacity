package com.udacity.kotlin

open abstract class Fish: FishAction{

    // Difference between Abstract classes and Interfaces is in Kotlin that
    // Abstract classes can have constructors but Interfaces can not
    abstract val fishSize: Double
    abstract  val fishWeight: Double

    override fun eat() = println(" Fish is eating yum")

}
