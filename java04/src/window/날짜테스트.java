package window;

import java.util.Date;

public class 날짜테스트 {

	public static void main(String[] args) {
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + "시 " + m + "분 " + s + "초 입니다.");
	}

}
