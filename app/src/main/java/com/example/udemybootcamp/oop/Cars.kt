package com.example.udemybootcamp.oop

fun main() {

    val bmw = Car("Kırmızı",50,true)

    bmw.info()
    bmw.isAccelerating(50)
    bmw.info()
    bmw.isDecelerating(20)
    bmw.info()
    bmw.drive()
    bmw.info()
    bmw.stop()
    bmw.info()
}