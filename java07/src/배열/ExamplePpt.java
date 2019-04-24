package 배열;

import java.util.Scanner;

public class ExamplePpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int students = 5;
		int sum = 0;
		
		int scores[] = new int[students];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("평균 성적은 " + sum/students + "입니다.");
		
		sc.close();
	}

}
