package com.itbank.mvc07;

public class CookUser {
	
	public static void main(String[] args) {
		KoreaCook korea = new KoreaCook();
		korea.make();
		korea.eat();
		
		JapanCook japan = new JapanCook();
		japan.make();
		japan.eat();
	}
}
