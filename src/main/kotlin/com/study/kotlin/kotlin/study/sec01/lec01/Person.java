package com.study.kotlin.kotlin.study.sec01.lec01;

import jakarta.annotation.Nullable;

public class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	@Nullable
	public String getName() {
		return name;
	}
}
