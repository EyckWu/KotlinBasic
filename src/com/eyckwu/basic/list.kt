package com.eyckwu.basic

fun main(){
    val items = listOf<String>("apple", "banana", "orange")
    for (item in items){
        println(item)
    }

    val items2 = setOf<String>("apple", "banana", "orange")
    when{
        "orange" in items2 -> println("juicy")
        "apple" in items2 -> println("apple is fit too")
    }

    val fruits = listOf<String>("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{println(it)}
}