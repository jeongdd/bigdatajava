package 배열;

import java.util.Scanner;

public class 수강신청 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select[] = new int[5];
		
		System.out.println("---------------------------------------");
		System.out.println("수강신청을 진행합니다.");
		while(true) {
			System.out.println("원하는 과목을 신청해주세요.");
			System.out.println("---------------------------------------");
			System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리");
			System.out.println("---------------------------------------");
		
			for (int i = 0; i < select.length; i++) {
				System.out.print(select[i] + "	");			
			}
			System.out.println();
			System.out.println("=======================================");
			System.out.print("원하는 코드를 입력해주세요.(종료 0) ==> ");
			
			int input = sc.nextInt();
			
			if(input == 0) {
				System.out.println("신청을 종료합니다.");
				System.out.println("안녕히 가세요.");
				break;
			}else if(input-1<select.length && select[input-1] != 1 ) {
					select[input-1] = 1; //신청처리
					System.out.println("신청 가능합니다.");
					System.out.println("신청이 완료 되었습니다.");
					System.out.println();
			}
			else {
				System.out.println("신청 불가능합니다.");
				System.out.println("다른 코드 번호를 입력해주세요.");
			
			}
		} // end while
		
		sc.close();
	}

}






















