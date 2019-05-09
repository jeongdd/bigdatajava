package java17;

public class MidStudent extends Student{
	//정적 속성
	String listenTest;
	
	//동적 속성
	
	@Override
	public void study() {
		System.out.println("영어공부를 합니다.");
	}
	
	public void academy() {
		System.out.println("학원을 갑니다.");
	}
}
