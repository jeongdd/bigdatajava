package 배열;

import java.util.Scanner;

public class 동아리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = {"김아무개","박아무개","송아무개","정아무개","장아무개"};
		int grade[] = {1,2,3,1,1};
		String scores[] = {"A","B","C","A","A"};
		int totalM = 0;
		int gradeN[] = new int[4];
		int scoresN[] = new int[5];
		String scorestemp[] = {"A","B","C","D","F"};
		int max1 = 0; 
		int max2 = -1;
		String max22 =null;
		
		System.out.println("동아리 명단의 이번학기 성적입니다.");
		System.out.println();
		System.out.println("이름" + "	" + "학년" + "	" + "학점");
		System.out.println("--------------------------------");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(name[i] + "	" + grade[i] + "	" + scores[i]);
			totalM++;
		}
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("1.전체 인원은?");
		System.out.println(totalM + "명 입니다.");
		System.out.println("2.전체 명단 프린트");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("이름: " + name[i] +", "  
								+"학년: "+ grade[i] +", " 
								+"학점: "+ scores[i]);
		}
		System.out.println("3.학년별 인원수, 학점별 인원수!");
		for (int i = 0; i < grade.length; i++) {
			switch (grade[i]) {
			case 1:
				gradeN[0]++;
				break;
			case 2:
				gradeN[1]++;
				break;
			case 3:
				gradeN[2]++;
				break;
			case 4:
				gradeN[3]++;
				break;
			default:
				break;
			}
			switch (scores[i]) {
			case "A":
				scoresN[0]++;
				break;
			case "B":
				scoresN[1]++;
				break;
			case "C":
				scoresN[2]++;
				break;
			case "D":
				scoresN[3]++;
				break;
			case "F":
				scoresN[4]++;
				break;
			default:
				break;
			}
		}
		System.out.println(scoresN[0] +" "+ scoresN[2]);
		for (int i = 0; i < gradeN.length; i++) {
			if(max1 < gradeN[i]) {
				max1 = i+1;
			}
		}
		for (int i = 0; i < scoresN.length; i++) {
			if(max2 <= scoresN[i]) {
				max2 = i;
			}
		}
		if(max2 == 0) {
			max22 = "A";
		}else if(max2 == 1) {
			max22 = "B";
		}else if(max2 == 2) {
			max22 = "C";
		}else if(max2 == 3) {
			max22 = "D";
		}else {
			max22 = "F";
		}
			
		for (int i = 0; i < gradeN.length; i++) {
			System.out.println(i + 1 + "학년 : " + gradeN[i] + "명");
		}
		System.out.println();
		for (int i = 0; i < scoresN.length; i++) {
			System.out.println(scorestemp[i] +  "학점 : " + scoresN[i] + "명");
		}
		System.out.println("4.이 동아리에 가장 많은 학년은?");
		System.out.println(max1);
		System.out.println("5.이 동아리 학생들의 가장 많은 학점은?");
		System.out.println(max22);
		System.out.println("=================================");
		System.out.println("6.이름을 입력받아 몇 번째 인덱스에 있는지 찾아보시오.");
		System.out.println("7.이름을 입력받아 학년과 학점을 출력해보세요.");
		String inputN = sc.next();
		
	}

}




















