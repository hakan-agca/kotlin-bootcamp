package com.example.udemybootcamp.collections

fun main() {
    //Tanımlama
    val number = ArrayList<Int>()
    val fruits = ArrayList<String>()

    // veri ekleme
    fruits.add("Elama")//.0
    fruits.add("Muz")//1.
    fruits.add("Kiraz")//2.

    println(fruits)

    println("Boyut : ${fruits.size}")
    println("Boyut : ${fruits.count()}")
    println("Boş kontrol : ${fruits.isEmpty()}")
    println("Boş kontrol : ${fruits.isEmpty()}")
    println("içeriyormu : ${fruits.contains("Elma")}")

    fruits.reverse() // sıralamayı terse çevir
    println(fruits)

    fruits.sort() // harf sırasına göre sırala
    println(fruits)

    for(fruit in fruits){ // listeyi dön
        println("sonuç : $fruit")
    }

    for((index,fruit) in fruits.withIndex()){ // index ile listeyi dön
        println("$index -> $fruit")
    }


}