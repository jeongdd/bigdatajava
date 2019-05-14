package java20;

public class SuperMan extends Man {
	String power;
	int speed;
	
	
	
	public SuperMan() {
		
	}


	public SuperMan(String power, int speed) {
		this.power = power;
		this.speed = speed;
	}


	public SuperMan(int weight, int height, String power, int speed) {
		super(weight, height);
		this.power = power;
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "SuperMan [power=" + power + ", speed=" + speed + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
