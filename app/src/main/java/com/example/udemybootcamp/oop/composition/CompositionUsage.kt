package com.example.udemybootcamp.oop.composition

fun main() {
    val c1 = Categories(1,"Dram")
    val c2 = Categories(2,"Komedi")
    val c3 = Categories(3,"Bilim kurgu")

    val d1 = Directors(1,"Nuri Bilge Ceylan")
    val d2 = Directors(2,"Quentin Tarantino")
    val d3 = Directors(3,"Christopher Nolan")

    val m1 = Movies(1,"Django",2013,c1,d2)
    val m2 = Movies(2,"Inception",2006,c3,d3)


    println("Film id : ${m1.film_id}")
    println("Film ad : ${m1.film_ad}")
    println("Film yıl : ${m1.film_yıl}")
    println("Film kategori : ${m1.kategori.kategori_ad}")
    println("Film yönetmen : ${m1.yonetmen.yonetmen_ad}")
}