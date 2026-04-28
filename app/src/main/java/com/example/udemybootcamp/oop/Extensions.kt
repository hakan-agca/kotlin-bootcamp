package com.example.udemybootcamp.oop

fun main() {
    val result = 5.product(2)
    println(result)
    val resultTwo = 5 plus 2
}

    // Var olan bir sınıfa yeni özellik kazandırmak için kullanılan fonksiyon türüdür.
fun Int.product(number : Int) : Int{
    return this*number // This Int sınıfı temsil eder.
}
    // iFonksiyonları daha okunabilir şekilde çağırmayı sağlayan özel yazım (syntax) özelliğidir.

infix fun Int.plus(number: Int) : Int{
    return this+number
}




