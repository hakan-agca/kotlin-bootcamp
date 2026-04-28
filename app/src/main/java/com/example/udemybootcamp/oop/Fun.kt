package com.example.udemybootcamp.oop

class Fun {

    // Void fonksiyonlar bir değer döndürmeyen fonksiyonlardır.

    fun helloOne() {
        val result = "Merhaba"
        println(result)
    }


    // return fonksiyonlar bir değer döndüren fonksiyonlardır.

    fun helloTwo(): String {
        val result = "Merhaba"
        return result
    }

    // parametre aldığım void fonksiyon

    fun helloThree(name: String) {
        val result = "Merhaba $name"
        println(result)
    }

    fun add(numberOne: Int, numberTwo: Int): Int {
        val result = numberOne + numberTwo
        return result
    }
    // overLoading aynı dosya içerisinde aynı isimde 1 den fazla fonksiyon yazımına izin verir

    fun product(numberOne: Int, numberTwo: Int) {
        val result = numberOne * numberTwo
        println(result)
    }

    fun product(numberOne: Double, numberTwo: Double) {
        val result = numberOne * numberTwo
        println(result)
    }




}