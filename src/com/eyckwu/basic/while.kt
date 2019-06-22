package com.eyckwu.basic

fun main(){
    val items = listOf("apple", "orange", "banana")
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}