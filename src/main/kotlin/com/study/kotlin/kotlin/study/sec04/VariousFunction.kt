package com.study.kotlin.kotlin.study.sec04

fun main() {
    val str = "ABC"
    println(str.lastChar())

    3.add(4)
    3.add2(4)
    3 add2 4
}
class VariousFunction {

}

// 1. 확장함수(String 클래스 확장, private, protected는 확장 불가)
// fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
// this...
// }
fun String.lastChar(): Char {
    return this[this.length - 1]
}

/**
 * 2. 중위함수(infix)
 * 함수 호출 방법을 다르게 할 수 있다.
 */
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

/**
 * 3. inline 함수
 * call chain over를 줄이기 위해 사용하는데, inline 함수 사용시 성능 측정이 필요하다
 */
inline fun Int.add3(other: Int): Int {
    return this + other
}

/**
 * 4. 지역함수
 * 함수를 추출하고 싶을 때 사용하지만, depth가 길어지고, 코드가 깔끔하지 않아서 선호하지는 X
 */

