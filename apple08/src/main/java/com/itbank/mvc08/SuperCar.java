package com.itbank.mvc08;

public class SuperCar implements Car {
	
	Window window;
	Door door;
	String color;
	int speed;
	
	

	public void setWindow(Window window) {
		this.window = window;
	}


	public void setDoor(Door door) {
		this.door = door;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void open() {
		System.out.println("<SuperCar>");
		window.open();
		door.doorOpen();
		System.out.println(color);
		System.out.println(speed);
		
	}

	@Override
	public void close() {
		window.close();
		door.doorClose();
	}

}
