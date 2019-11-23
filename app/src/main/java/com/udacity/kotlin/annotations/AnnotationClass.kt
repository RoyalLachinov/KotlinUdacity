package com.udacity.kotlin.annotations

import kotlin.reflect.KClass

@ImaPlant class AnnotationClass {
fun trim(){}
    fun realize(){}
    val age:Int = 23;
    val isOld: Boolean = false
}
annotation class ImaPlant

fun reflection(){
    var classObs:KClass<AnnotationClass> = AnnotationClass::class
    for (annotation:Annotation in classObs.annotations){
        println(annotation.annotationClass.simpleName)
    }

}

fun main(args: Array<String>) {
    reflection()
}