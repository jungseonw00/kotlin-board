package com.study.kotlin.kotlin.study.sec01.lec03

import com.study.kotlin.kotlin.study.sec01.lec01.Person

class VariableTypeInKotlin {
    fun main() {
        val number1: Int? = 4
//    val number2 : Long = number1.toLong() // to기본타입으로 명시적 변환 필요
    }
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
//    println(person.age)
}