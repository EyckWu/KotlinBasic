package com.eyckwu.basic

open class A{
    open fun f(){
        println("A # f")
    }

    fun a(){
        println("A # a")
    }
}

interface B{
    fun f(){
        println("B # f")
    }
    fun b(){
        println("B # b")
    }
}

class C() : A(), B{
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

fun main(){
    val c: C = C()
    c.f()
}