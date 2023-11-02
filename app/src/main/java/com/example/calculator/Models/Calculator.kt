package com.example.calculator.Models

class Calculator(private val number01: Double, private val number02: Double) {
    fun add() = number01 + number02
    fun substrac() = number01 - number02
    fun divide() = number01/number02
    fun multipication() = number01*number02
}