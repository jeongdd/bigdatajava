package com.itbank.mvc08;

public class SportCar implements Car {

	Window window;
	String color;
	int speed;
	Door door;
	

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoor(Door door) {
		this.door = door;
	}
	
	public void setWindow(Window window) {
		this.window = window;
	}
	
	
	@Override
	public void open() {
		System.out.println("<SportCar>");
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
