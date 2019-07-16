package com.itbank.mvc08;

public class StrongWindow implements Window {

	@Override
	public void open() {
		System.out.println("강화유리가 열리다.");
	}

	@Override
	public void close() {
		System.out.println("강화유리가 닫히다.");
	}

}
