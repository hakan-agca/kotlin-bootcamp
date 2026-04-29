package com.example.udemybootcamp.oop.packageOne

open class A {
    // visibility modifier

    var standardVariable = 1

    public var publickVariable = 2 // Her yerden erişilebilir.

    private var privateVariable = 3 // Sadece class içerisinden erişilebilir.

    internal var internalVariable = 4 // Sadece aynı proje (module) içinde erişilebilir.

    protected var protectedVariable = 5 // Sadece kendi sınıfında ve o sınıftan türeyen (inheritance) sınıflarda kullanılabilir.

    fun functionn(){
        println(privateVariable)
    }
}