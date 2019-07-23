package com.itbank.mvc10;

import org.springframework.stereotype.Component;

@Component("b")
public class BSite {
	
	public void search() {
		System.out.println("물건 검색~~~~");
	}
	
	public void cart() {
		System.out.println("장바구니입니다.");
	}
	
	public void order() {
		System.out.println("주문하세요.");
	}
}
