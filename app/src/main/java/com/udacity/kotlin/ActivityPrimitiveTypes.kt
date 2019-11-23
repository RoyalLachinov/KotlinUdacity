package com.udacity.kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import java.util.*

class ActivityPrimitiveTypes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        Log.println(Log.INFO, "String test", returnString())
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
            Log.println(Log.INFO, "Boolean test ", "true")
        if (str1 != str2)
            Log.println(Log.INFO, "Boolean test ", "false")
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
        Log.println(
            Log.INFO, "sdsd", "\nPlus: " + (a.plus(b)) + "\nMinus: " + (a.minus(b)) +
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
}
