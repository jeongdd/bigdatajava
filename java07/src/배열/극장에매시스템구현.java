package 배열;

import java.util.Scanner;

public class 극장에매시스템구현 {

	public static void main(String[] args) {
		int seat[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		int totalR = 0; // 총 좌석 예매 수
		int totalM = 0; // 전체 금액 계산액
		
		while(true) {
			System.out.println("-------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + "  ");
			}		
			System.out.println();
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
				
			}
			System.out.println();
			System.out.println("===============================");
			
			System.out.println("종료는 x, 예매는 o >>");
			String end = sc.next();
			if(end.equals("x")) {
				System.out.println("에매 시스템을 종료합니다.");
				break;
			}
			System.out.print("예매할 좌석 번호 입력 : ");
			int input = sc.nextInt(); //1
			
			if(seat[input-1] != 1) {
				seat[input-1] = 1; //예매처리
				System.out.println("좌석 예매 완료!");
					totalR += 1;
				System.out.println("총 누적 좌석수는 :" + totalR + "좌석 입니다.");
				
			}else {
				System.out.println("!오류!");
				System.out.println("이미 예매 된 좌석입니다.");
				System.out.println("다른 좌석을 선택해주세요.");
			}
			totalM = totalR * 10000;
			System.out.println("총 누적된 금액은 : " + totalM + "원 입니다.");
		}
		
		sc.close();
	}

}
