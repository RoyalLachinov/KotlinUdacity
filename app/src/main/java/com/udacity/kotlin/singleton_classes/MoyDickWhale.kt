package com.udacity.kotlin.singleton_classes

object MoyDickWhale {
    //In order to declare a class singleton it we need to add object type to it

    val author = "Herman Melville"
    fun jump() {
        //TODO
        println("Jump over")
    }
}

enum class ColorEnum(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sealion"
    }
}

fun main(args: Array<String>) {
    val moyDick  = MoyDickWhale
    moyDick.jump()

    val colorEnum = ColorEnum.BLUE
    println(colorEnum)
    val seaLion = SeaLion()

   println(matchSeal(seaLion))
}