package com.itbank.mvc77;

public class CookManager{
	Cook c = null;
	
	public CookManager() {
	}
	
	public CookManager(Cook cook) {
		c = cook;
	}
	
	public void orderRice() {
		c.makeRice();
	}
	
	public void orderSoup() {
		c.makeSoup();
	}
}
