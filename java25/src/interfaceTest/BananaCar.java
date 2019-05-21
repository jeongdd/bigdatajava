package interfaceTest;

public class BananaCar implements Car {

	public void start() {
		System.out.println("차가 달리기 시작한다.");
	}
	
	public void speedUp() {
		System.out.println("속도 Up");
	}
	
	public void speedDown() {
		System.out.println("속도 Down");
	}

}
