package com.example.udemybootcamp.oop.packageTwo

import com.example.udemybootcamp.oop.packageOne.A

class B : A() {

    fun function(){
        println(standardVariable)
        println(publickVariable)

        println(internalVariable)
        println(protectedVariable)
    }
}