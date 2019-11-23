package com.udacity.kotlin

open class Aquarium {
    constructor()
    constructor(i: Int, i1: Int, i2: Int)
// Classes Lesson
/*    public - Default. Class and public members
    private - Inside class. Subclas CAN NOT see
    protected - Inside class, Subclasses CAN see
    internal(default in java) - Module level(Package level)*/


    // immutable - unchangeable
    // mutable - changeable
    val width: Int = 20;
    val height: Int = 20;
    val lenght: Int = 20;

    var price: Int = 200;

    fun volumeOfAquarium(): Int {

        val myAquarium: Aquarium = Aquarium();
        return (myAquarium.height * myAquarium.lenght * myAquarium.width) / 1000;
    }

    fun volume(): Int = (height * lenght * width) / 1000;
    fun volume2() = (height * lenght * width) / 1000;
    val volume : Int get() = (height * lenght * width) / 1000;
}


fun main(args: Array<String>) {
    val myAquarium: Aquarium = Aquarium();
    println(Aquarium().width)
    println(Aquarium().height)
    println(Aquarium().lenght)
    println("Width: ${myAquarium.width} Height: ${myAquarium.height} and Length: ${myAquarium.lenght}")
    println("Volume of the aquarium is: ${volumeOfAquarium()}")
    println("Volume of the aquarium is: ${myAquarium.volumeOfAquarium()}")
    println("Volume of the aquarium is: ${myAquarium.volume()}")
    println("Volume of the aquarium is: ${myAquarium.volume2()}")
    println("Volume of the aquarium is: ${myAquarium.volume}")

}

fun volumeOfAquarium(): Int {

    val myAquarium: Aquarium = Aquarium(0,0,0);
    return (myAquarium.height * myAquarium.lenght * myAquarium.width) / 1000;
}