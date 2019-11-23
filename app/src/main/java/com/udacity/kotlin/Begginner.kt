package com.udacity.kotlin

import android.util.Log
import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {

    // val is unchangeable - final
    // var is changeable - not final

    val myAge: Int = 36
    val wiredNumber: Int = 6
    var length: Int? = null
    var lengt2 = null
    add(myAge, wiredNumber)

    var i: Int = 4
    val n: Number = i
    i = n.toInt() //Int can't be boxed to Number but Number can be boxed to Int
    val b: Byte = 34
    val c: Int = b.toInt()

    // null can't be a value in Kotlin, but if we add question mark to the end of variable, then it can be null
    val lotsOfFish: List<String?> = listOf(null, null)
    val everMoreFish: List<String>? = null
    var definitlyFish: List<String?>? = null
    definitlyFish = listOf(null, null)

    var goldFish: String? = "Gold Fich"
    goldFish = null
    //Log.println(Log.INFO, "Not null control ", goldFish!!)

    /*
    var goldWeight : Int = 23
    if(returnNumber(goldWeight)){
        Log.println(Log.INFO, "returnNumber ", "true")
    }else{
        Log.println(Log.INFO, "returnNumber ", "false")
    }
*/
    println(returnString())
    returnBoolean()
    returnWhen(14)

    //-----------------------------------

    //if a list is val then we can add or remove a value to/from it
    val myFishList = mutableListOf<String>("Tuna", "Shark", "Salmon")
    myFishList.add("Sazan")
    println(myFishList[2])
    println(myFishList)

    //printing mixed array
    val mixArray = arrayOf("fix", 2)
    println(Arrays.toString(mixArray))
    val nestedArray = arrayOf(myFishList, arrayOf("Delphin", "Whale"), mixArray)
    println(Arrays.deepToString(nestedArray))
    for (element in Arrays.deepToString(nestedArray))
        print(element)
    for ((index, element) in Arrays.deepToString(nestedArray).withIndex())
        print("Fish at $index is $element")

    for (i in 'b'..'g')
        print(i)
    println()
    for (i in 1..5)
        print(i)
    println()
    for (i in 5 downTo 0)
        print(i)
    println()
    for (i in 3..12 step 2)
        print(i)
    println()
    val array = Array(5) { it * 5 }
    println("\n" + array.asList())

    val printExpr = println("This is an expression")
    print(printExpr)
    println()
    val temp = 50;
    val isHot = if (temp > 30) true else false
    println(isHot)
    val message = "You are ${if (temp > 50) "fired " else "safe"} "
    println(message)

    feedTheFish()
    println(getRandomDay())
    //defultPar
    printDefPar()

    repeat(4) {
        println("I like to fish")
    }

    execFilter()
}

//Filters

fun execFilter() {
    val decorations = listOf<String>("rock", "pogoda", "plastic plant", "alligator", "flower pot")
    //println(decorations.filter { true})
    println(decorations.filter { it[0] == 'p' })


    //apply filter lazily
    val filtered = decorations.filter { it[0] == 'p' }
    println(filtered)

    //apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }
    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("as List: ${lazyMap.toList()}")

    //anonym function(lambda)
    val swim = { println("Hi dear anonym function") }()
    println(swim)

    //lambda
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(20))
    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(feedFish(20))
    println(waterFilter2(30))
    sayLambda()

}

//lambda
fun feedFish(dirty: Int) = dirty + 2

val sayLambda = { println("Hey Lamda") }

//one line functions
val defultPar = println("Hi sir")

fun defaultParFunc() = println("Siiiiirrrr");

fun printDefPar(param: Any = defaultParFunc()) {
    println(param)
}

fun getRandomDay(): String {
    val daysOfTheWeek =
        listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return daysOfTheWeek[Random().nextInt(7)]
}

fun feedTheFish() {
    //val day = "Tuesday"
    val day = getRandomDay()
    //val food = "pellets"
    //val food = getFishFood()
    val food = getFishFoodRan(day)
    println("Today is $day and our fish eats $food")

    //Default value parametr
    //swim(speed = "slow")
    swim("slow")
    //Here we did not pass any parametrs
    swimFish()

    //If there is not default value in the parametr, that means it is required
    // in this case we have to specify parametr name as following
    swimFish1(30, eats = "banana")
    if (shouldChaneWater(day)) {
        println("Water should be changed")
    }

    if (shouldChangeWater2(day)) {
        println("Water should be changed compact")
    }

    if (isTooHot(32)) {
        println("It is too Hot")
    }
}

//compact function
fun shouldChangeWater2(day: String, temperature: Int = 20, dirty: Int = 20): Boolean {

    /* val isTooHot = temperature > 20
     val isDirty = dirty > 30
     val isSunday = day == "Sunday"
     return when {
         isTooHot -> true
         isDirty -> true
         isSunday -> true
         else -> false
     }*/

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday("Sunday") -> true
        else -> false
    }
}

//Single line compact method
fun isTooHot(temperature: Int): Boolean = temperature > 30

fun isDirty(dirty: Int): Boolean = dirty > 25
fun isSunday(day: String): Boolean = day == "Sunday"

fun shouldChaneWater(day: String, temperature: Int = 20, dirty: Int = 20): Boolean {
    return when {
        temperature > 20 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun swimFish1(time: Int, speed: String = "fast", eats: String) {
    println("Fish swimming $speed $time minutes and eats  $eats")
}


fun swimFish(time: Int = 30, speed: String = "fast") {
    println("Fish swimming $speed $time minutes")
}

fun swim(speed: String = "fast") {
    println("Fish swimming $speed")
}

fun getFishFood(): String {
    val fishFoods = arrayListOf<String>("Banana", "Orange", "Lemon", "Pellets")
    return fishFoods[Random().nextInt(4)]
}

fun getFishFoodRan(day: String): String {
    return when (day) {
        "Monday" -> "Banana"
        "Tuesday" -> "Orange"
        "Wednesday" -> "Lemon"
        "Thursday" -> "Pellets"
        else -> "nothing, because it is in diet"
    }
}

fun returnWhen(a: Int) {
    when (a) {
        0 -> println("It is 0")
        50 -> println("It is 50")
        else -> println("Never mind")
    }
}

fun returnBoolean() {

    var str1 = "Gold "
    var str2 = "Fish"

    if (str1 == str2)
        println("Boolean test true")
    if (str1 != str2)
        println("Boolean test false")
}

fun returnString(): String {
    var str1 = "Gold "
    var str2 = "Fish"
    var numberOfFishes = 34
    var numberOfPlants = 40

    //return "I have $numberOfFishes $str1 $str2 and $numberOfFishes plants "
    return "I have ${numberOfFishes + numberOfPlants} $str1 $str2 and $numberOfPlants plants"
}

fun add(a: Int, b: Int) {
    println(
        "\nPlus: " + (a.plus(b)) + "\nMinus: " + (a.minus(b)) +
                "\nMultiple: " + (a.times(b)) + "\nDivide: " + (a.div(b)) + "\nAnd: " + (a.and(b)) +
                "\nOR: " + (a.or(b)) + "\nCompare: " + a.compareTo(b) + "\nDecrements: " + (a.dec()) + "\nIncrements: " + (a.inc()) +
                "\ninv() - Inverts the bits in this value: " + (a.inv()) + "\nrangeTo(b) - Created a range from this value to the specified other value: " + (a.rangeTo(
            b
        )) +
                "\nunaryMinus() - Returns negative of the specified value: " + (a.unaryMinus()) +
                "\nrem(b) - Calculates the reminder of dividing this value bye the other value" + (a.rem(
            b
        ))
    )
}

fun returnNumber(a: Int): Boolean {
    return (a?.dec() ?: 0) as Boolean
}