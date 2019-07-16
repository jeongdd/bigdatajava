package com.itbank.mvc08;

public class SkyDoor implements Door {
	
	
	@Override
	public void doorOpen() {
		System.out.println("문이 열림.");
	}

	@Override
	public void doorClose() {
		System.out.println("문이 닫힘.");
	}

}
