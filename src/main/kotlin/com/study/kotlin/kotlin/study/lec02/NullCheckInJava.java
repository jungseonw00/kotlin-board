package com.study.kotlin.kotlin.study.lec02;

public class NullCheckInJava {

	public static void main(String[] args) {
		System.out.println("hi");
	}

	public boolean startWithA1(String str) {
		if (str == null) {
			throw new IllegalArgumentException("null이 들어왔습니다.");
		}
		return str.startsWith("A");
	}

	public Boolean startWithA2(String str) {
		if (str == null) {
			return null;
		}
		return str.startsWith("A");
	}

	public boolean startWithA3(String str) {
		if (str == null) {
			return false;
		}
		return str.startsWith("A");
	}
}
