package com.study.kotlin.kotlin.study.sec04;

import lombok.Data;

@Data
public class Fruit {
	private final String name;
	private final int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
