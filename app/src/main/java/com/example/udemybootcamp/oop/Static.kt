package com.example.udemybootcamp.oop

fun main() {
    val a = ClassA()


   /* println(a.x)

    a.metod()

    // Virtual object - Sanal nesne - İsimsiz nesne

    println(ClassA().x)

    ClassA().metod()*/

    // static performans olarak daha verimli çalışır

    println(ClassA.x)
    ClassA.metod()
}