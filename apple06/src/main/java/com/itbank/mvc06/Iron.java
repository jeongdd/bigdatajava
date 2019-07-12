package com.itbank.mvc06;

public class Iron implements Door {

	@Override
	public void open() {
		System.out.println("철제문 open");
	}

	@Override
	public void close() {
		System.out.println("철제문 close");

	}

	@Override
	public void key() {
		System.out.println("철제문 key");

	}

	@Override
	public void made() {
		System.out.println("철제문 made");

	}

}
