package com.example.udemybootcamp.oop

fun main() {
    // Nullable - Nul safety - Optional(Swift)

    var x = "Merhaba"

    // Tanımlama

    var str: String? = null

    // yöntem 1

    println("1. yöntem ${str?.trim()}") // trim öündeki veya arkasındaki  gereksiz boşlukları siler
    // yöntem 2
    // println("2. yöntem ${str!!.trim()}")

    // yöntem 3
    if(str != null){
        println("3. yöntem ${str.trim()}")
    }else{
        println("null geldi")
    }

    // yöntem 4

    str?.let {
        println("3. yöntem ${it.trim()}")

    }
}