package com.itbank.mvc07;

public abstract class ShopCoffee implements Coffee{

	public abstract void prepare();
	
	@Override
	public void make() {
		System.out.println("가게에서 커피를 만들다.");
	}

	@Override
	public void pay() {
		System.out.println("가게에서 커피를 계산하다.");
	}
	
}
