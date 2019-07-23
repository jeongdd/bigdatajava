package com.itbank.mvc10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser2 {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext factory = new GenericXmlApplicationContext("aopContext.xml");
		
		BInterface b2 = (BInterface)factory.getBean("b2");
		b2.productFind("지우개", 1000);
		b2.productOrder();
		b2.basket();
		
		
		factory.close();
	}
}
