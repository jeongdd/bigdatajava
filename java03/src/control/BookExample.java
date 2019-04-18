package control;

import java.util.Scanner;

public class BookExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("안정성 점수를 입력하세요 : ");
		int safety = sc.nextInt();
		System.out.print("속도 점수를 입력하세요 : ");
		int fast = sc.nextInt();
		System.out.print("연비 점수를 입력하세요 : ");
		int oil = sc.nextInt();
		
		double save = safety * 0.5;
		double fave = fast * 0.3;
		double oave = oil * 0.2;
		double ave = save + fave+ oave;
		String result;
		
		if(ave >= 80) {
			result = "우수";
		}else if(ave < 80) {
			result = "보통";
		}else {
			result = "불량";
		}
		System.out.println("점수는 " + ave + "점 이고, 평가는" + result + "입니다.");
		
	}

}
