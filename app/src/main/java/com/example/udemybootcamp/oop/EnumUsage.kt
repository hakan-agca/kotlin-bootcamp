package com.example.udemybootcamp.oop

fun main() {
    price(50,Enumeration.ORTA)
}

fun price(adet : Int, boyut : Enumeration){

    when(boyut){
        Enumeration.KUCUK -> println("Toplam fiyat  ${adet * 30}")
        Enumeration.ORTA -> println("Toplam fiyat  ${adet * 40}")
        Enumeration.BUYUK -> println("Toplam fiyat  ${adet * 50}")
    }
}

