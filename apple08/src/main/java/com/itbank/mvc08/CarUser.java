package com.itbank.mvc08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		// root가 src/main/resources

		Car car1 = (Car) factory.getBean("sport");
		car1.open();
		car1.close();

		Car car2 = (Car)factory.getBean("super");
		car2.open(); 
		car2.close();
		 

		/*
		 * Car car3 = (Car)factory.getBean("super1"); car3.open(); car3.close();
		 * 
		 * Car car4 = (Car)factory.getBean("super2"); car4.open(); car4.close();
		 */

	}
}
