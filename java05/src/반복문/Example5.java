package 반복문;

public class Example5 {

	public static void main(String[] args) {
//		#5 1단부터 9단까지 구구단을 출력하세요(for문)
		int result = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				result = i*j;
				System.out.println(i + "*" + j + "=" + result);
			}
			System.out.println("==================");
		}
		System.out.println();
	}

}
