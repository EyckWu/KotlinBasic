package com.eyckwu.basic

open class Foo{
    open fun f(){
        println("Foo.f()")
    }

    open val x: Int get() = 1
}

class Bar: Foo(){
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int
        get() = super.x + 1
}

fun main(){
    val bar: Bar = Bar()
    bar.f()
}