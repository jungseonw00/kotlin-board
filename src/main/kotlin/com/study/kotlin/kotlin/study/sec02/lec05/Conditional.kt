package com.study.kotlin.kotlin.study.sec02.lec05

class Conditional {
    fun validateScoreIsNotNegative(score: Int) {
        // score가 0~100 범위안에 있지 않으면
        if (score in 0..100) {
            throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
        }
    }

    fun getPassOrFail(score: Int): String {
        return if (score >= 50) {
            "P"
        } else {
            "F"
        }
    }
//    fun getGradewithSwitch(score: Int): String {
//        when (score / 10) {
//            in 90..99 -> "A"
//            in 80..89 -> "B"
//            in 70..79 -> "C"
//            else -> "D"
//        }
//    }

//    fun startsWithA(obj: Any): Boolean {
////        return when (obj) {
////            is String -> obj.startsWith("A")
//////            else ->
////        }
//    }

    fun judgeNumber(number: Int) {
        when (number) {
            1, 0, -1 -> println()
            else -> println("")
        }
    }

    fun judgeNumber2(number: Int) {
        when {
            number == 0 -> println("주어진 숫자는 0입니다.")
            number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
            else -> println("주어지는 숫자는 홀수입니다.")
        }
    }
}