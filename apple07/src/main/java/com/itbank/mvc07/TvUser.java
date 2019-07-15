package com.itbank.mvc07;

public class TvUser {
	
	public static void main(String[] args) {
		//AppleTv apple = new AppleTv();
		//apple.powerOn();
		//apple.powerOff();
		//apple.volumUp();
		//apple.volumDown();
		
		/*
		 * BananaTv banana = new BananaTv(); banana.powerOn(); banana.powerOff();
		 * banana.volumUp(); banana.volumDown();
		 */
		
		Tv banana = new CherryTv();
		banana.powerOn();
		banana.powerOff();
		banana.volumUp();
		banana.volumDown();
	}
}
