package com.eyckwu.basic

open class Base(val name: String){
    init {
        println("init base")
    }

    open val size: Int = name.length.also { println("init size in base $it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("arg for base $it") }){
    init {
        println("init Derived")
    }

    override val size: Int = (super.size + lastName.length).also{"init size in derived $it"}
}

fun main(){
    println("Constructing Deived")
    val derived: Derived = Derived("hello", "world")
}