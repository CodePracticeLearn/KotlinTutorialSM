package com.example.myapplication

fun main() {
    val age: Int = readLine()!!.toInt();

    if (age >= 18) {
        println("age $age")
    } else if (age >= 40) {
        println("you are above 40")
    } else {
        println("you are not 18 years old !!")
    }

    //when

    when (age) {
        18 -> {
            println("you are above 18")
        }
        else -> {
            println("you are not 18")
        }
    }

    val number: Int = readLine()!!.toInt();

    when (number % 2) {
        0 -> {
            println("you are even")
        }
        else -> {
            println("you are odd")
        }
    }


}