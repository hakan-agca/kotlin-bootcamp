package com.example.udemybootcamp.function

import android.R


fun main() {
    val question = HomeWork()

    val questionOne = question.kmMil(10.0)
    println("Soru 1 sonuç : $questionOne")

    val questionTwo = question.rectangle(5, 10)

    val questionThree = question.factorial(5)
    println("Soru 3 sonuç : $questionThree")

    val questionFour = question.stringControl("Hello World")

    val questionFive = question.calculateInteriorAngle(3)
    println("Soru 5 sonuç : $questionFive")

    val questionSix = question.salaryCalculation(25)
    println("Soru 6 sonuç : $questionSix")

    val questionSeven = question.money(2)
    println("Soru 7 sonuç : $questionSeven")
}






