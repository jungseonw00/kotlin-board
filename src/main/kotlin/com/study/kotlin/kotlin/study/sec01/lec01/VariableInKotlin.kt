package com.study.kotlin.kotlin.study.sec01.lec01

class VariableInKotlin {
    fun main() {
        /**
         * 코틀린은 수정가능여부를 작성해줘야 함
         * var: 변경 가능
         * val: read-only
         * 타입 추론 가능
         */
        var number1 = 10L
        number1 = 5L

        val number2 = 10L
//        number2 = 5L // assign fail

        // val은 최초 한 번까지는 값을 할당 가능
        // 기본은 val로 선언하고 변경이 필요한 것만 var로 선언하기
        val number3: Long = 5L
        println(number3)

        var number4 = 10L
        var number5 = 1_000L

        /**
         * null이 들어갈 수 있다면 타입에 ?를 추가한다.
         */
        var number6: Long? = 1_000L
        number6 = null

        /**
         * 인스턴스화 될 때 new 연산자 사용 X
         */
        var person = Person("최태현")

    }
}