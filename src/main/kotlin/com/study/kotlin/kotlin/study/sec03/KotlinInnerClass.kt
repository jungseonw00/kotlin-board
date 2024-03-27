package com.study.kotlin.kotlin.study.sec03

class KotlinInnerClass(
    val address: String,
    val livingRoom: LivingRoom
) {

    class LivingRoom(
        val area: Double
    )
}