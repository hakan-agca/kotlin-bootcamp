package com.example.udemybootcamp.collections

fun main() {
    val iller = HashMap<Int, String>()

    iller.put(34, "İstanbul")
    iller.put(35, "İzmir")
    iller[6] = "Ankara"

    println(iller)

    println(iller.get(34))

    iller.put(34, "İstanbul Yeni")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())
    for ((anahtar,deger) in iller){
        println("$anahtar : $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)
}