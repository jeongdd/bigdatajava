package 반복문;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		// 두 개의 입력값을 받아서,
		// 첫 번째 값 부터 두 번째 값 까지 더함.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		System.out.print("숫자 1 입력 :");
		int num1 =sc.nextInt(); //초기값(시작 값)
		System.out.print("숫자 2 입력 :");
		int num2 =  sc.nextInt();
		
		int sum = 0;
		while(num1 <= num2) { // 조건식
			//더하는 식
			sum =  sum + num1;
			//증감식
			num1++;
		}
		System.out.println(num1 + "와" + num2+ "의 합은" + sum);
		
		sc.close();
	}

}
