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
}