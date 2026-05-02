package com.example.udemybootcamp.tryCatch

fun main() {
    // 1. Compile error = Kodlama yapılırken hata yapılan kırmızı olan geri dönüş

   // val x = 10
   // x = 60

    // 2.Exception : Runtime Error = Çalıştırma sırasında alınan hata uygulama çökmesine sebep olur

    val a = 10
    val b = 2

    try {
        println("sonuç : ${a/b}")
        println("işlem tamam ")

    }catch (e : Exception){ // uygulama artık çökmez , hata mesajı verir
        println("Hatalı sayı girdiniz")
    }
}