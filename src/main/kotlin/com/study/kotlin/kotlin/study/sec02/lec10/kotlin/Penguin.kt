package com.study.kotlin.kotlin.study.sec02.lec10.kotlin

class Penguin (
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2;

    override fun move() {
        TODO("Not yet implemented")
    }

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}