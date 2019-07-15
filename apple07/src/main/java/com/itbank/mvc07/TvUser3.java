package com.itbank.mvc07;

public class TvUser3 {
	
	public static void main(String[] args) {
		FactoryBean factory = new FactoryBean();
		Tv tv = (Tv)factory.getBean(args[0]);  //down 캐스팅   //args[0] -> RunAs에서 지정 
		// Tv tv = (Tv)factory.getBean("apple"); -> 직접 사용할 때
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
	}
}
