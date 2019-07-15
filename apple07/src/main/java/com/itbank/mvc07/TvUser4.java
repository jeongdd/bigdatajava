package com.itbank.mvc07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TvUser4 {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Tv tv = (Tv)factory.getBean("tv"); // id 값 지정해놓은 이름으로 가져오면 됨  => 결합도를 낮추는 코드
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
	}
}
