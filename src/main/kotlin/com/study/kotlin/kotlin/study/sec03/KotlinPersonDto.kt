package com.study.kotlin.kotlin.study.sec03

import com.study.kotlin.kotlin.study.sec03.Country.AMERICA
import com.study.kotlin.kotlin.study.sec03.Country.KOREA

fun main() {
    val dto1 = KotlinPersonDto("최태현", 100)
    val dto2 = KotlinPersonDto("최태현", 200)
    println(dto1)
}

// data 키워드 추가로 equals, hashCode 생성
data class KotlinPersonDto(
    private val name: String,
    private val age: Int
) {
}

fun handleCountry(country: Country) {
    when (country) {
        KOREA -> TODO()
        AMERICA -> TODO()
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US");
}