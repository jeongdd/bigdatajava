package 배열;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("수를 입력하세요 : ");
			su[i] = sc.nextInt();
		}
		for (int i = 0; i < 1; i++) {
			int su1 = su[0] + su[2];
			System.out.println(su[0] + " + " + su[2] + "은 " + su1 + "입니다.");
		}
		
		sc.close();
	}

}
