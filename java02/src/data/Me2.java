package data;

import java.util.Scanner;

public class Me2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("--------------------");
		
		System.out.print("당신의 취미는?");
		String hobby = sc.next();
		
		System.out.print("당신의 TV 시청 시간는?");
		int watch = sc.nextInt();
		
		System.out.println("봄여행을 다녀왔나요?(true/false)");
		boolean trip = sc.nextBoolean();
		
		System.out.println("--------------------");
		System.out.println("내 취미는 " + hobby + "이고, 평소에 TV를 " + watch + "시간도 보지 않아요.");
		System.out.println("봄 여행은 " + trip + "예요.");
		
	}

}
