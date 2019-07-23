package com.itbank.mvc10;

import org.springframework.stereotype.Component;

@Component("c")
public class CSite {
	
	public void InfoView() {
		System.out.println("주문정보 보기");
	}
	
	public void View() {
		System.out.println("주문정보 확인");
	}
}
