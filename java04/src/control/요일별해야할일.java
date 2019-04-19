package control;

import java.util.Date;

public class 요일별해야할일 {

	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();		
		
		String result = "";
		
		switch(day) {
		case 0 :
			result = "일요일 : 운동장 세 바퀴 도는 날"; 
			break;
		case 1 :
			result = "월요일 : 학원에 가는 날";
			break;
		case 2 :
			result = "화요일 : 동네 한 바퀴 도는 날";
			break;
		case 3 :
			result = "수요일 : 동네 두 바퀴 도는 날";
			break;
		case 4 :
			result = "목요일 : 동네 세 바퀴 도는 날";	
			break;
		case 5 :
			result = "금요일 : 운동장 한 바퀴 도는 날";
			break;
		default :
			result = "토요일 : 운동장 두 바퀴 도는 날";
		}

		System.out.println("오늘은 " + result + "입니다.");

	}
}

