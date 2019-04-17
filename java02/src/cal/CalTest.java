package cal;

public class CalTest {

	public static void main(String[] args) {
		// 1.
		int a = 100;
		int b = 100;
		int result = a+b;
		if( a+b >= 300 ) {
			System.out.println(result - 100);
		}else{
			System.out.println(result * 0.1);
		}
		
		//2.
		int c = 400;
		int result2 = c%2;
		if(result2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
//		while() //while은 무조건 논리형 / 무한 루프형
		
		
		
	}

}
