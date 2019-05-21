package interfaceTest;

public class CarUser {

	public static void main(String[] args) {
		Car car = new MelonCar();
		//upcasting, 다형성
		//Car라는 인터페이스로 앞을 맞추어 놓고,
		//이것을 구현한 클래스는 다양하게 사용할 수 있다.
		
		
		car.start();
		car.speedUp();
		car.speedDown();
	}

}
