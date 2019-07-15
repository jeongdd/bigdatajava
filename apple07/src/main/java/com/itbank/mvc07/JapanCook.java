package com.itbank.mvc07;

public class JapanCook implements Cook {

		
	@Override
	public void make() {
		System.out.println("소바를 만든다.");
	}

	@Override
	public void eat() {
		System.out.println("소바를 먹는다.");
	}

}
