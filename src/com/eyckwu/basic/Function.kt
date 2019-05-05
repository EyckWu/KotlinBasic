package com.eyckwu.basic

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sum(a: Int, b: Int, c: Int) = a + b + c

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}

fun main(){
    println("3 + 3 = " + sum(3, 3))
    println("1 + 2 + 3 = " + sum(1, 2, 3))
    printSum(1, 2)
}