package control;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보내가한것 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.print("숫자를 입력하세요(0:가위, 1:바위, 2:보) : ");
			int game = sc.nextInt();
			int com = random.nextInt(3);
			
			if(game == 0 && com == 2) {
				System.out.println("이겼습니다.");
			}else if(game > com) {
				System.out.println("이겼습니다.");
			}else if(game < com ) {
				System.out.println("졌습니다.");
			}else if(game == 2 && com == 0) {
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
		
	}
		
}



