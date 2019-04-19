package control;

import java.util.Scanner;

public class 등급판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력 : ");
		String score = sc.next();
		
		char grade = score.charAt(0);
		if(grade == 'A') {
			System.out.println("최우수입니다.");
		}else if(grade == 'B') {
			System.out.println("우수입니다.");
		}else if(grade == 'C') {
			System.out.println("보통입니다.");
		}else {
			System.out.println("통과하지 못했습니다.");
		}
		
	}
		

}


