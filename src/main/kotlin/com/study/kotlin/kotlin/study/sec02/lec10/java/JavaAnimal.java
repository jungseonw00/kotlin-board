package com.study.kotlin.kotlin.study.sec02.lec10.java;

public abstract class JavaAnimal {

	protected final String species;
	protected final int legCount;

	public JavaAnimal(String species, int legCount) {
		this.species = species;
		this.legCount = legCount;
	}

	abstract public void move();

	public String getSpecies() {
		return species;
	}

	public int getLegCount() {
		return legCount;
	}
}
