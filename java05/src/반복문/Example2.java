package 반복문;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
//		#2 입력받은 값 만큼 ★을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력받을 횟수를 입력하세요 :");
		int su = sc.nextInt();
		
		for (int i = 0; i < su ; i++) {
			System.out.println("★");	
		}
		
		sc.close();
	}

}
