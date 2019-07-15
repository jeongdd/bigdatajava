package com.itbank.mvc77;

public class KoreanCook implements Cook{

	@Override
	public void makeRice() {
		System.out.println("한국밥");
	}

	@Override
	public void makeSoup() {
		System.out.println("한국스프");
	}

	@Override
	public void makeSalad() {
		System.out.println("한국샐러드");
	}

	@Override
	public void makeSource() {
		System.out.println("한국소스");
	}

}
