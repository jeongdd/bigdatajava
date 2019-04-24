package 배열;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sub[] = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("과목을 입력하세요 : ");
			sub[i] = sc.next();
		}
		for (int i = 0; i < 1; i++) {
			System.out.println("**" + sub[0] + "보다는 " + sub[2] +"**");
		}
		
		sc.close();
	}

}
