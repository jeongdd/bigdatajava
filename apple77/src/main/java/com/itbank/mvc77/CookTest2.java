package com.itbank.mvc77;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest2 {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Cook cook = (Cook) factory.getBean("korea");

		CookManager cm = new CookManager(cook);
		cm.orderRice();
		cm.orderSoup();

	}

}
