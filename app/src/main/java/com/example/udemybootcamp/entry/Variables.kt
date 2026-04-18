package com.example.udemybootcamp.entry


fun main() {
    // println("Merhaba dünya")

    var studentName = "Ahmet"
    var studentAge = 23
    var studentSize = 1.98
    var studentInitial = 'A'
    var continuity = true

    println(studentName)
    println(studentAge)
    println(studentSize)
    println(studentInitial)
    println(continuity)


    var product_id: Int = 3416
    var product_name: String = "Macbook Pro"
    var product_stock: Int = 100
    var product_price: Double = 42999.99
    var product_supplier: String = "Apple"

    println("Ürün id : $product_id")
    println("Ürün Adı : $product_name")
    println("Ürün Stock Adeti : $product_stock")
    println("Ürün Fiyatı : $product_price")
    println("Ürün Tedarikçi : $product_supplier")

    var a = 10
    var b = 20

    println("$a x $b : ${a * b}")

    // Sabitler = Constant

    var numberOne = 30
    println(numberOne)
    numberOne = 100
    println(numberOne)

    val numberTwo = 30
    println(numberTwo)

    // Tür dönüşümü = Type Casting

    val i = 42
    val d = 98.55
    // Sayısaldan sayısala dönüşüm
    // Dikkatli olunmalı aksi halde veri kaybına yol açabilir.

    val resultOne = i.toDouble()
    val resultTwo = d.toInt()
    println(resultOne)
    println(resultTwo)

    // Sayısaldan metine dönüşüm

    val resulThree = i.toString()
    val resultFour = d.toString()
    println(resulThree)
    println(resultFour)

    // Metinden sayısala dönüşüm

    val input = "67.54"

    val resultFive = input.toDouble()
    println(resultFive)
    // Kullanıcı bu sayılara bir harf girerse hata verecektir.
    // çözümü aşşağıdaki gibidir

    val resultSix = input.toDoubleOrNull()

     // if koşuldur

    if( resultSix != null){
        println(resultSix)
    }else{
        println("Lütfen sayınızı kontrol ediniz")
    }




}

