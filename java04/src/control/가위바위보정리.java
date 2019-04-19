package control;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보정리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(0:가위, 1:바위, 2:보) : ");
		int me = sc.nextInt();
		
		Random random = new Random();
		int com = random.nextInt(3);
		System.out.println("컴퓨터는 " + com);
		
		String win = null;
		if(me==0) { // 가위
			if(com==0) {
				win="비겼습니다.";
			}else if(com==1) {
				win = "컴퓨터 승리";
			}else {
				win = "내가 승리";
			}
		}
		if(me==1) { // 바위
			if(com==0) {
				win="내가 승리";
			}else if(com==1) {
				win = "비겼습니다.";
			}else {
				win = "컴퓨터 승리";
			}
		}
		if(me==2) { // 보
			if(com==0) {
				win="컴퓨터 승리";
			}else if(com==1) {
				win = "내가 승리";
			}else {
				win = "비겼습니다.";
			}
		}
		System.out.println(win);
		
	}
}
