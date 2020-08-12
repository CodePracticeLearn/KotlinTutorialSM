package com.example.myapplication

fun main() {
    //math operations
    var number1 = readLine()!!.toDouble()
    var number2 = readLine()!!.toDouble()
    val sum = number1 + number2
    println("sum $sum")
    val div = number1 / number2
    println("div $div")

    //increment n decrement
    var count = 1
    count += count

    count -= 1
    println("count $count ")

//exercise:
    var i = 5;
    println(i++);
    print(i--);
}