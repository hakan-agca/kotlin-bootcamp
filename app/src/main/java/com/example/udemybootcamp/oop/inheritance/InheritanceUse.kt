package com.example.udemybootcamp.oop.inheritance

fun main() {
    var topkapıPalace = Palace(10,200)

    var bogazVilla = Villa(true,15)

    println(topkapıPalace.pencereSayısı)
    println(topkapıPalace.kuleSayisi)

    println(bogazVilla.pencereSayısı)
    println(bogazVilla.garajVarmi)

    if (topkapıPalace is Palace){ // palace den mi  türedi , Burdan mı oluştu
        println("Topkapı Palace Palace'dir")

    }else{
        println("Topkapı Palace Palace değildir")

    }

    // tür dönüşümüne örnek olsun diyr yapılmıştır
    // Upcasting
    val ev : Home = bogazVilla

    // Downcasting
    val ev1 = Home(7)
    val saray = ev1 as Palace

}



