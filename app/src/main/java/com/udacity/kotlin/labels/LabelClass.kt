package com.udacity.kotlin.labels

class LabelClass {
}

fun main(args: Array<String>) {
    firstLoop@for (i:Int in 1..100){
        secondLoop@for (j:Int in 1..100){
            print("$i ")
            if(j == 4)break@secondLoop
        }
    }
}