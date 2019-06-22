package com.eyckwu.basic

fun main(){
    val items = listOf<String>("apple", "banana", "orange")
    for (item in items){
        println("$item")
    }
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }
}