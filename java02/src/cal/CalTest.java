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
		
		System.out.println("----삼항연산자로 출력");
		
		System.out.println(result2 == 0 ? "짝수" : "홀수");
		
		System.out.println();
		
//		while() //while은 무조건 논리형 / 무한 루프형
		
		//3.
		int h = 4;
		int m = 17;
		int t = 25;
		
		System.out.println("[오늘과 관련된 내용입니다.]");
		System.out.println("---------------------");
		System.out.println("지금은 " + h + "시" + m + "분입니다.");
		System.out.println("오늘의 기온은 " + t + "도 입니다.");
		System.out.println("오늘은 정말 덥습니다.");
		System.out.println("---------------------");
		
		
		
	}

}
