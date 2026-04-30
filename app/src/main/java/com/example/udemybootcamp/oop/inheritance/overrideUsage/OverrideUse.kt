package com.example.udemybootcamp.oop.inheritance.overrideUsage

fun main() {
    val hayvan = Animal()
    val memeli = Mammal()
    val kedi = Cat()
    val kopek = Dog()

    hayvan.sesCikar() // Kalıtım yok,kendi sınıfına erişti
    memeli.sesCikar() // kalıtım var , üst sınıfın metodunu kullandı
    kedi.sesCikar() // kalıtım var , kendi metodunu kullandı
    kopek.sesCikar() // kalıtım var , kendi metdonu kullandı


}
