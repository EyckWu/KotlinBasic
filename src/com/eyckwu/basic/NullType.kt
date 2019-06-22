package com.eyckwu.basic

fun main(){
    printProduct("3", "5")
}

fun printProduct(arg1: String, arg2: String){
    val a = parseInt(arg1)
    val b = parseInt(arg2)

    if (a != null && b != null){
        println("$a * $b = ${a * b}")
    }
}

fun parseInt(arg: String): Int? {
    return arg.toIntOrNull()
}