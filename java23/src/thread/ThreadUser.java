package thread;

public class ThreadUser {

	public static void main(String[] args) {
		// 스레드 객체 생성
		ForTest1 t1 = new ForTest1();  // 부모의 기본생성자 자동 호출
		ForTest2 t2 = new ForTest2(); 
		ForTest3 t3 = new ForTest3();  
		
		t1.start();  // 인식만하고 바로 실행되지 않는다 (대기중)
		t2.start();
		t3.start();
	}

}
