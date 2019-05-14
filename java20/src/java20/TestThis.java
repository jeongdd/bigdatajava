package java20;

public class TestThis extends TestSuper {
	int c;
	String cc;
	
//	public TestThis() {
//		System.out.println("나는 자식클래스");
//	}

	public TestThis(int c, String cc) {
		this.c = c;
		this.cc = cc;
		
		
	}

	public TestThis(int a, int b, String aa, int c, String cc) {
		super(a, b, aa);
		this.c = c;
		this.cc = cc;
	}
	
	
}
