package java17;

public class EleStudent extends Student{
	//정적 속성
	int money;
	
	//동적 속성
	
	@Override //재정의
	public void study() {
		System.out.println("구구단을 배워요.");
	}
	
	public void time() {
		System.out.println("학교에서 일찍 끝납니다.");
	}
}
