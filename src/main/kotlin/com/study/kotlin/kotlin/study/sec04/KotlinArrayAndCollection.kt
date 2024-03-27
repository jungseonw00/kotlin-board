package com.study.kotlin.kotlin.study.sec04

class KotlinArrayAndCollection {
    // 1. 배열(잘 사용 안함, 리스트 사용 추천)
    val array = arrayOf(100, 200)

}

// 2.컬렉션(리스트, 셋, 맵)
fun main() {
    // 1. 배열
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i}번 째 인덱스의 값은 ${array[i]}")
    }

    array.plus(300)

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // 2. 컬렉션 (가변, 불변으로 나뉨, 불변 객체의 element의 필드는 변경할 수 있음(자바랑 동일))
    val numbers = listOf(100, 200) // 타입 추론 가능으로 타입 생략 가능
    val numbers2 = mutableListOf(100, 200) // 가변 리스트 생성

    val emptyList = emptyList<Int>() // 타입 명시 필요
    printNumbers(emptyList)

    // 인덱스 접근 방법 3가지
    numbers[0]

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {

    }

    // Set
    val number3 = setOf(100, 200)

    for (number in number3) {
        println(number)
    }

    for ((idx, value) in number3.withIndex()) {

    }

    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, entries) in oldMap.entries) {

    }

    // 컬렉션의 null 가능성
    /**
     * 자바 <-> 코틀린에서 컬렉션 사용시 주의해야됨 (nullable 문제)
     * List<Int?>  => element nullable, list not null
     * List<Int>?  => element not null, list nullable
     * List<Int?>? => element nullable, list null
     */

}

private fun printNumbers(numbers: List<Int>) {

}
