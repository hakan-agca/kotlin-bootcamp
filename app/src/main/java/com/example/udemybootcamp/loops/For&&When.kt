package com.example.udemybootcamp.loops


fun main() {

    val days = 5

    when(days){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")
    }

    for(i in 1..5){
        println(i)
    }

    for(i in 5..10 step 5){
        println(i)
    }

    for(i in 20 downTo 5 step 5){
        println(i)
    }

    for(i in 5..10){
        if(i == 7){
            break
        }
        println(i)
    }
    for (i in 5..10){
        if (i == 7){
            continue
        }
        println(i)
    }

    var index = 1

    while (index <= 5){
        println(index)
        index++
    }





}