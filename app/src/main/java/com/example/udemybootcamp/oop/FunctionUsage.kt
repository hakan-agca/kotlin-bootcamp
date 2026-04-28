package com.example.udemybootcamp.oop

fun main() {
    val f = Fun()
    // void çağırımı değer dönmüyor dönüş tipi unit
    f.helloOne()

    // return çağırımı değer dönüyor dönüş tipi String
    val result = f.helloTwo()
    println(result)

    // parametre aldığım fonksiyon

    f.helloThree("Hakan")

    val addResult = f.add(15, 20)
    println(addResult)

    // overloading çağırımı

    f.product(5, 5)
    f.product(5.0, 5.0)
}



