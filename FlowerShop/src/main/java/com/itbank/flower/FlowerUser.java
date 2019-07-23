package com.itbank.flower;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FlowerUser {
	public static void main(String[] args) {
		GenericXmlApplicationContext factory = new GenericXmlApplicationContext("aspectContext.xml");
		
		FlowerShop shop = (FlowerShop)factory.getBean("flower");
		shop.welcome();
		shop.member("홍길동");
		shop.buy("홍길동", 20000);
		shop.explorer();
		shop.iDonknow();
	}
}
