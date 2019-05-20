package stringTest;

import java.awt.RadialGradientPaint;
import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.random()); // 0 ~ 1이 되기 전 값의 범위 (double)
		int num = (int) (Math.random() + 10);
		System.out.println(num);

		double num2 = 12345.6789;
		System.out.println(Math.ceil(num2)); // 반올림
		System.out.println(Math.floor(num2)); // 반내림
		System.out.println(Math.round(num2));

		final double NUM = 1000;
//		NUM = 2000;  // X
		// 상수는 한 번 넣어두고 변하지 않아야 하는
		// 데이터를 넣어둘 때 사용
		// 상수에 들어간 데이터는 변경 불가
		// 일반 변수와 비교하기 위해 대문자로 써두는 것이

		int num3 = -100;
		System.out.println(Math.abs(num3));

		int num4 = -200;
		System.out.println(Math.max(num3, num4));
		System.out.println(Math.min(num3, num4));

		int num5 = 3;
		System.out.println(Math.pow(num5, 2)); // double이 int를 포함한 상태 -> 출력은 double형

		Random r = new Random();
		r.setSeed(100);  // 동일한 값으로 test할 대 
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(10));
		}
	}

}

















