package com.example.myapplication

fun main() {
    var x = 10
    var y = 20

    var temp: Int = x
    x = y
    y = temp

    println("x $x and y $y")


    //without a temp variable

    x = x + y
    y = x - y
    x = x - y
    println("x $x and y $y")

}