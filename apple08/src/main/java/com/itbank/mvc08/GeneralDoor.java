package com.itbank.mvc08;

public class GeneralDoor implements Door {

	@Override
	public void doorOpen() {
		System.out.println("문이 열렸습니다.");
	}

	@Override
	public void doorClose() {
		System.out.println("문이 닫혔습니다.");
	}

}
