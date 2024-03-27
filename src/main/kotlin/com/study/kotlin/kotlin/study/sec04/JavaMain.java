package com.study.kotlin.kotlin.study.sec04;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaMain {
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("사과", 1_000),
				new Fruit("사과", 1_200),
				new Fruit("사과", 1_200),
				new Fruit("사과", 1_500),
				new Fruit("바나나", 3_000),
				new Fruit("바나나", 3_200),
				new Fruit("바나나", 2_500),
				new Fruit("수박", 10_000)
		);
		List<Fruit> apples = findApples(fruits);
		for (Fruit apple : apples) {
			System.out.println("apple = " + apple);
		}
	}

	private static List<Fruit> findApples(List<Fruit> fruits) {
		List<Fruit> apples = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruit.getName().equals("사과")) {
				apples.add(fruit);
			}
		}
		return apples;
	}

	private static List<Fruit> findBananas(List<Fruit> fruits) {
		List<Fruit> apples = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruit.getName().equals("바나나")) {
				apples.add(fruit);
			}
		}
		return apples;
	}

	/**
	 * - 사과 + 바나나 같이 보여주세요.
	 * - 사과이면서 가격이 1200원을 넘지 않은 것만 보여주세요.
	 * - 1만원 이하의 수박과 천원 이상의 바나나를 보여주세요
	 */
	private static List<Fruit> findFruitsWithName(List<Fruit> fruits, String name) {
		List<Fruit> results = new ArrayList<>();
		for (Fruit fruit : fruits) {
			if (fruit.getName().equals(name)) {
				results.add(fruit);
			}
		}
		return results;
	}
}
