package control;

import java.util.Random;
import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);
	
		int count = 0; //while문 안에 있으면 while이 돌 때 마다 0으로 초기화 되기 때문에 밖으로 뺌
		while(true) {
			count = count +1;
			System.out.print("당신이 생각한 숫자를 입력하세요 >> ");
			int su = sc.nextInt();
				if(target == su) {
					System.out.println("정답입니다.");
					System.out.println("당신이 시도한 횟수는 :"+ count);
					break;
				}else {
					System.out.println("정답이 아닙니다.");
					System.out.println("다시 입력해주세요.");
					if(target > su) {
						System.out.println("정답보다 작아요.");
					}else {
						System.out.println("정답보다 커요.");
					}
				}
		}//while 
		
	} //main end.

} //class end.
