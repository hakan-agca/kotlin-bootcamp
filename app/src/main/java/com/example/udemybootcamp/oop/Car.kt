package com.example.udemybootcamp.oop

class Car(var color : String, var speed : Int, var isWorking : Boolean) {
    init {
        println("Araba Sınıfından nesne oluşturuldu")
    }

    fun drive(){
        speed = 5
        isWorking = true
    }

    fun stop(){
        speed = 0
        isWorking = false
    }

    fun isAccelerating(km : Int){
        speed += km
    }

    fun isDecelerating(km : Int){
        speed -= km
    }

    fun info(){
        println("***************************")
        println("Cars Color     : $color")
        println("Cars speed     : $speed")
        println("Cars isWorking : $isWorking")
        println("***************************")
    }
}