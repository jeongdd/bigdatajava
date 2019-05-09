package java17;

public class SuperMan extends Man {
	// 정적 속성
	boolean fly;
	
	// 동적 속성
	public void flySpeed() {
		sleep();
		System.out.println("500으로 날아요.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}

