package com.udacity.kotlin.inlines

class InlineClass(val fishName: String) {
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main(args: Array<String>) {
    val fishName = InlineClass("Sazan")

    //without inline an object is created every call to myWith
    println( myWith(fishName.fishName, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    }))

    // with inline no object is created and lambda body is inlined here
   println(fishName.fishName.capitalize())
}