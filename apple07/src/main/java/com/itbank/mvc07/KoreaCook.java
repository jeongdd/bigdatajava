package com.itbank.mvc07;

public class KoreaCook implements Cook {

	@Override
	public void make() {
		System.out.println("불고기를 만든다.");
	}

	@Override
	public void eat() {
		System.out.println("불고기를 먹는다.");
	}

}
