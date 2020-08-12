package com.example.myapplication

fun main() {
    //different loop controls in Kotlin

    for (i: Int in 1..10) {
        println("hi $i")

    }
    //return and jump
    for (i: Int in 1..3) {
        println("Hi outer loop")
        if (i == 2) {
            continue;
        }
        for (j: Int in 1..3) {
            println("Hi inner loop")
            break;

        }

    }

    // break the external loop, give the label to external loop

    loop@ for (i: Int in 1..3) {
        println("Hi outer loop")
        if (i == 2) {
            continue;
        }
        for (j: Int in 1..3) {
            println("Hi inner loop")
            break@loop;

        }

    }

    for (i: Int in 1..100) {
        if (i % 2 == 0) {
            println(i)
        } else {
            continue;
        }
    }

}