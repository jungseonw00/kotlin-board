package com.study.kotlin.kotlin.study.lec02

import com.study.kotlin.kotlin.study.lec01.Person

class NullCheckInKotlin {

    fun main() {
        var str: String? = "ABC"
        // safe call
        str = null
        println(str!!.startsWith("A"))
        println(str?.length)
        // elvis
        println(str?.length ?: 0)

        val person = Person("공부하는 개발자")
        startsWithA(person.name)
    }

    fun startsWithA(str: String): Boolean {
        return str.startsWith("A")
    }

    fun beforeStartWithA1(str: String?): Boolean {
        if (str == null) {
            throw IllegalArgumentException("null이 들어왔습니다.")
        }

        return str.startsWith("A")
    }

    fun afterStartWithA1(str: String?): Boolean {
        return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
    }

    fun beforeStartWithA2(str: String?): Boolean? {
        if (str == null) {
            return null;
        }
        return str.startsWith("A")
    }

    fun afterStartWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    fun beforeStartWithA3(str: String?): Boolean {
        if (str == null) {
            return false
        }
        return str.startsWith("A")
    }

    fun afterStartWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

    fun startWith(str: String?): Boolean {
        return str!!.startsWith("A") // 이 변수는 절대 null이 아님을 단언한다.
    }
}