package com.eyckwu.basic

abstract class Shape(val sides: List<Double>){
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(val height: Double, val length: Double): Shape(listOf(height, length, height, length)), RectangleProperties{
    override val isSquare: Boolean
        get() = length == height

    override fun calculateArea(): Double {
        return height * length
    }
}

class Triangle(var sideA: Double, val sideB: Double, val sideC: Double): Shape(listOf(sideA, sideB, sideC)){
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}

fun main(){
    val rectangle = Rectangle(5.0, 2.0)
    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is ${rectangle.calculateArea()}, its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()}, its perimeter is ${triangle.perimeter}")
}