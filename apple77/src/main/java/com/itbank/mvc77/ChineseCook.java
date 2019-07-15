package com.itbank.mvc77;

public class ChineseCook implements Cook{

	@Override
	public void makeRice() {
		System.out.println("중국밥");
	}

	@Override
	public void makeSoup() {
		System.out.println("중국스프");
	}

	@Override
	public void makeSalad() {
		System.out.println("중국샐러드");
	}

	@Override
	public void makeSource() {
		System.out.println("중국소스");
	}

}
