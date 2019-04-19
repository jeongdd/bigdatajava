package control;

import java.util.Date;

public class 년도계산 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
				
		int result = 2222 - year;
		
		System.out.println("지금은 " + year + "년 입니다.");
		System.out.println("현재부터 2222년까지는 " + result + "년 남았습니다.");
		
		
		}
		

	}


