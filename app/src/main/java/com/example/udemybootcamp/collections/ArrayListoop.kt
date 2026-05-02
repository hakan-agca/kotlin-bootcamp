package com.example.udemybootcamp.collections

fun main() {

    val o1 = Student(100,"Ahmet","9C")
    val o2 = Student(150,"oktay","10A")
    val o3 = Student(130,"Hakan","8A")

    val ogrenciler = ArrayList<Student>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)

    for(i in ogrenciler){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")
    }


    // Sort-Sıralama
    println("Sayısal : Küçükten > Büyüğe")
    val sıralama1 = ogrenciler.sortedWith(compareBy { it.no }) // veri tabanlarında karşılığı : ASC = Ascend
    for(i in sıralama1){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")
    }


    println("Sayısal : Büyükten > Küçüğe")
    val sıralama2 = ogrenciler.sortedWith(compareByDescending { it.no })// veri tabanlarında karşılığı : DESC = Descend
    for(i in sıralama2){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")
    }

    println("Metinsel : Küçükten > Büyüğe")
    val sıralama3 = ogrenciler.sortedWith(compareBy { it.ad }) // veri tabanlarında karşılığı : ASC = Ascend
    for(i in sıralama3){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")
    }

    println("Sayısal : Büyükten > Küçüğe")
    val sıralama4 = ogrenciler.sortedWith(compareByDescending { it.ad})// veri tabanlarında karşılığı : DESC = Descend
    for(i in sıralama4){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")
    }

    // Filtreleme

    println("Filtreleme 1")

    val filtreleme1 = ogrenciler.filter { it.no > 100 }
    for(i in filtreleme1){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")
    }

    println("Filtreleme 2")

    val filtreleme2 = ogrenciler.filter { it.ad.contains("h") }
    for (i in filtreleme2){
        println("No : ${i.no} Ad: ${i.ad} Sınıf: ${i.sınıf}")

    }











}