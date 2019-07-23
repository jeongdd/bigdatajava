package com.itbank.mvc10;

import org.springframework.stereotype.Component;

@Component("b2")
public class BSiteImpl implements BInterface {

	@Override
	public String productFind(String name, int price) {
		System.out.println(name + "을(를) 검색하다");
		System.out.println("가격은" + price + "원 입니다.");
		return "검색 완료 ok";
	}

	@Override
	public void basket() {
		int num[] = {1,2};
		num[2] = 3;
		System.out.println("장바구니에 넣다.");
	}

	@Override
	public void productOrder() {
		System.out.println("물건을 주문하다.");
	}

}
