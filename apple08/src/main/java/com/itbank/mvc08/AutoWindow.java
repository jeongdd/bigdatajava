package com.itbank.mvc08;

public class AutoWindow implements Window {

	@Override
	public void open() {
		System.out.println("자동으로 열리다.");
	}

	@Override
	public void close() {
		System.out.println("자동으로 닫히다.");
	}

}
