package com.itbank.mvc77;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Cook c1 = (Cook)factory.getBean("china");
		c1.makeRice();
		c1.makeSalad();
		c1.makeSoup();
		c1.makeSource();
		
		/*
		 * Cook c2 = (Cook)factory.getBean("korea"); c2.makeRice(); c2.makeSalad();
		 * c2.makeSoup(); c2.makeSource();
		 */
		
	}
}
