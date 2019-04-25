package 배열;

import java.util.Scanner;

public class 콘도예약 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select[] = new int[5];
		
		while(true) {
			System.out.println("------------- 콘도 예약을 진행합니다. -------------");
			System.out.println("  §원하는 지역을 신청해 주세요(각 지역은 2명까지 신청 가능)§");
			System.out.println("-------------------------------------------");
			System.out.println(" 1)강원도      2)전라도      3)파주       4)제주도      5)충청도");
			System.out.println("-------------------------------------------");
			for (int i = 0; i < select.length; i++) {
				System.out.print("  " + select[i] + "	  ");
			}
			System.out.println();
			System.out.println("===========================================");
			System.out.print("원하시는 지역 코드를 입력하세요.(종료는 0) >>");
			int input = sc.nextInt();
			
		
				if(input == 0) {
					System.out.println("종료합니다.");
					break;
				}
				else if(select[input-1] >= 0 && select[input-1] <= 5) {
					if(select[input -1] < 2) {
						System.out.println("신청 가능합니다.");
						select[input - 1] += 1;
						System.out.println("신청이 완료되었습니다.");
					}else {
						System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
						System.out.println("다른 지역을 선택해 주세요.");
						}
						
				}
				
		}
	}

}
