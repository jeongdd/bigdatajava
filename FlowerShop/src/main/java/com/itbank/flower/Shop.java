package com.itbank.flower;

import org.springframework.stereotype.Component;

@Component("flower")
public class Shop implements FlowerShop {

	@Override
	public void member(String name) {
		System.out.println(name + "님 환영합니다.");
	}

	@Override
	public void buy(String name, int price) {
		System.out.println(name + "님의 구매 금액은 " + price + "원 입니다.");
	}

	@Override
	public void iDonknow() {
		int aa[] = {1,2,3};
		aa[3] = 4;
		System.out.println("난 몰라요 ㅇㅅㅇ");
	}

	@Override
	public void welcome() {
		System.out.println("hihi!!");
	}

	@Override
	public void explorer() {
		System.out.println("실행중......");
		
	}

}
