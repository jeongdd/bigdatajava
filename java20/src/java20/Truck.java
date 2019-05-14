package java20;

public class Truck extends Car {
	int weigth;
	int length;
	
	
	public Truck() {
		System.out.println("트럭 객체 생성...");
	}

	public Truck(int weigth, int length) {
//		super(); 
		//기본값 -> 자식클래스 생성시 부모의 기본생성자를 무조건 호출하게 되어있음.
		this.weigth = weigth;
		this.length = length;
	}

	public Truck(String color, int speed, int weigth, int length) {  //부모클래스의 멤버변수까지 호출
		super(color, speed);  // 명시적 호출은 지우면 안됨.
		this.weigth = weigth;
		this.length = length;
	}
	
	
	
}
