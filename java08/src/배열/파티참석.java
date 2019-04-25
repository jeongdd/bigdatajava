package 배열;

import java.util.Scanner;

public class 파티참석 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		int age[] = new int[5];
		int totalM = 0;
		int totalA = 0;
		double ave = 0;
		
		//참가자 등록
		for (int i = 0; i < age.length; i++) {
			System.out.print("참가자의 이름과 니이를 입력하세요 :");
			name[i] = sc.next();
			age[i] = sc.nextInt();
			totalM++;
		}
		//전체인원수 출력
		System.out.println("♠ 참가자 전체 인원수  >> " + totalM + "명 입니다.");
		System.out.println();
		//전체 명단 출력
		System.out.println("§ 파티 참석자 전체 명단입니다 §");
		for (int i = 0; i < age.length; i++) {
			System.out.println("이름 : " + name[i] + ",   " + "나이 : " + age[i]);
		}
		//참석자의 평균나이
		for (int i = 0; i < age.length; i++) {
			totalA = totalA + age[i];
		}
		System.out.println();
		ave = totalA / totalM ;
		System.out.println("♣ 참석자의 평균 나이는 : " + ave + "살 입니다.");
	}

}































