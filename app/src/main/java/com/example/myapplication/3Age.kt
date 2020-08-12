package com.example.myapplication

import java.util.*

fun main() {

    println("enter your year of birth")
    val x = readLine()!!.toInt()

    val age: Int = Calendar.getInstance().get(Calendar.YEAR) - x
    print("your age is $age")
}