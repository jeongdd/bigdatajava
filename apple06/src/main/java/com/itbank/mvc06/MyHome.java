package com.itbank.mvc06;

public class MyHome {
	
	// static Wood woodDoor; => 의존성이 높음
	static Door woodDoor; //의존성을 낮춤 (Door로 Upcasting)
	
	public static void main(String[] args) {
		woodDoor = new Iron();
		
		woodDoor.open();
		woodDoor.close();
		woodDoor.key();
		woodDoor.made();
	}
}
