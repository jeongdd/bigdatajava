package 배열;

import java.util.Scanner;

public class 파티참석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		int age[] = new int[5];
		int totalM = 0;
		
		//참가자 등록
		for (int i = 0; i < age.length; i++) {
			System.out.print("참가자의 이름과 니이를 입력하세요 :");
			name[i] = sc.next();
			age[i] = sc.nextInt();
			totalM++;
		}
		//전체인원수 출력
		System.out.println("전체 인원수는 " + totalM + "명 입니다.");
		//전체 명단 출력
		System.out.println("§ 파티 참석자 전체 명단입니다 §");
		
		//참석자의 평균나이
	}

}
