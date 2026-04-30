package com.example.udemybootcamp.oop.interfaceUse

class ClassA : MyInterface {
    override val degişken: Int = 10


    override fun metod1() {
       println("metod 1 çalıştı")
    }

    override fun metod2(): String {
        return "metod 2 çalıştı "
    }
}