package com.study.kotlin.kotlin.study.sec03;

public class JavaInnerClass {

	private String address;
	private LivingRoom livingRoom;

	public JavaInnerClass(String address, LivingRoom livingRoom) {
		this.address = address;
		this.livingRoom = livingRoom;
	}

	public LivingRoom getLivingRoom() {
		return livingRoom;
	}

	public static class LivingRoom {
		private double area;

		public LivingRoom(double area) {
			this.area = area;
		}
	}
}
