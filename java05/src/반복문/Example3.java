package 반복문;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
//		#3 세 수를 입력 받아서 그 수를 더한 값을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.println("세 번째 수를 입력하세요 : ");
		int n3 = sc.nextInt();
		
		int su = n1 + n2 + n3;
		
		System.out.println("세 수의 합은 : " + su);
		
		sc.close();
	}

}
