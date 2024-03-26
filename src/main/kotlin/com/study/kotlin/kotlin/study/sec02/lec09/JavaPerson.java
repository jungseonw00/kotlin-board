package com.study.kotlin.kotlin.study.sec02.lec09;

public class JavaPerson {
	private final String name;
	private int age;

	public JavaPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
