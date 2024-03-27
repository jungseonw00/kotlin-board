package com.study.kotlin.kotlin.study.sec04

import java.util.*

/**
 * 복습 필요(17강)
 */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    // 람다를 만드는 방법 1
    // 함수이름 생략(이름없는 함수, 람다)
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2 = {
        fruit: Fruit -> fruit.name == "사과"
    }

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])

    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
}
private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}
class KotlinLambda {

}