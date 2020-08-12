package com.example.myapplication

fun main() {
    print("enter string")
    val str: String? = readLine()!!.toString()
    print("enter Double")
    val str2: Double? = readLine()!!.toDouble()

    println("str ${str!!}")
    println("str ${str2!!}")
}