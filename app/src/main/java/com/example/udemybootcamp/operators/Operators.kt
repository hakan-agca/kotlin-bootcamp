package com.example.udemybootcamp.operators

fun main() {

    val a = 40
    val b = 50

    val x = 90
    val y = 80

    println("a == b ${a == b}") // a , b ye eşitmi "false"
    println("a != b ${a != b}") // a, b ye eşit değil mi "true"
    println("a > b ${a > b}")   // a, b den büyük mü "false"
    println("a < b ${a < b}")   // a, b den küçük mü "true"
    println("a >= b ${a >= b}") // a, b den büyük mü veya eşit mi "false"
    println("a <= b ${a <= b}") // a, b den küçük mü veya eşit mi "true"



    println("a > b || x > y ${a > b || x > y}") // (OR) veya demek false, false ise false olur.diğer durumlarda true olur
    println("a > b && x > y ${a > b && x > y}") // (AND) ve demek true, true ise true olur.diğer durumlarda false olur


}