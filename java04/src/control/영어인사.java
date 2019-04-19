package control;

import java.util.Date;

public class 영어인사 {

	public static void main(String[] args) {
		Date date = new Date();
		int h = date.getHours();
		
		if(h < 12) {
			System.out.println("Good morning~^^");
		}else if(h < 17) {
			System.out.println("Good afternoon~ㅇㅅㅇ");
		}else if (h < 20) {
			System.out.println("Good evening :)");
		}else {
			System.out.println("Good night! ;)");
		}
	}

}
