package com.udacity.kotlin.sam

class SamClass {
}

fun main(args: Array<String>) {
    val runnable = object: Runnable{
        override fun run() {
            println("I'm a runnable")
        }
    }

    runnable.run()
}