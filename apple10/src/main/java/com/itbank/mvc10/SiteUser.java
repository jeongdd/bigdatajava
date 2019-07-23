package com.itbank.mvc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser {
	
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("aopContext.xml");
		ASite a = (ASite)factory.getBean("a");
		a.personalInfo();
		System.out.println("========================");
		CSite c = (CSite)factory.getBean("c");
		c.InfoView();
		c.View();
		System.out.println("========================");
		BSite b = (BSite)factory.getBean("b");
		b.search();
		b.cart();
		b.order();
	}
}
