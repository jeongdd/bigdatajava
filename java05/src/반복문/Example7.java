package 반복문;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
//		#6 다음과 같이 입력하여 출력하세요(1-봄 ,2-여름,3-가을,4-겨울)
//		계절[1-4]을 선택하세요 => 5
//		계절[1-4]을 선택하세요 => 8
//		계절[1-4]을 선택하세요 => 1
//		계절은 봄 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1-봄 ,2-여름,3-가을,4-겨울");
		
		for(int i = 0; i < 1;) {
			int num = sc.nextInt();
			switch(num) {
			case 1:System.out.println("계절은 봄입니다."); i++; break;
			case 2:System.out.println("계절은 여름입니다."); i++; break;
			case 3:System.out.println("계절은 가을입니다."); i++; break;
			case 4:System.out.println("계절은 겨울입니다."); i++; break;
			}
		}
		sc.close();
	}
}

