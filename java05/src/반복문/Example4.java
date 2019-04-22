package 반복문;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
//		#4 문자열을 두 개 입력(next()이용!) 하여 다음과 같이 출력
//		입력1 : 안녕하세요, 입력 2 : 자바 사랑
//		출력 : **안녕하세요 자바사랑**
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요:");
		String in1 = sc.next();
		System.out.print("문장을 입력하세요:");
		String in2 = sc.next();
		
		System.out.println("**" + in1 + " " + in2 + "**");
		
		sc.close();
	}

}
