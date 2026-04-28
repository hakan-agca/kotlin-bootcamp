package com.example.udemybootcamp.function

class HomeWork {

    fun kmMil(km: Double): Double {
        return km * 0.621
    }

    fun rectangle(a: Int, b: Int) {
        val area = a * b
        println("Dikdörtgenin alanı a x b : $area")
    }

    fun factorial(number: Int): Int {
        var index = 1

        for (i in 1..number) {
            index *= i
        }
        return index
    }

    fun stringControl(text: String) {

        var index = 0

        for (i in text) {
            if (i == 'e') {
                index++
            }
        }
        println("Metinde $index adet e vardır")
    }

    fun calculateInteriorAngle(number: Int): Int {
        return (number - 2) * 180 / number
    }

    fun salaryCalculation(days: Int): Int {
        var day = days * 8

        if (day <= 150) {
            day * 40
        } else {
            var normal = 150
            var mesai = day - 150
            day = (normal * 40) + (mesai * 80)
        }
        return day
    }

    fun money(cash : Int) : Int{
        var normal = 0

            if (cash <= 1) {
                normal = 50
            } else {
                normal = 50
                normal = normal+(cash-1)*10
            }


        return normal
    }

}





