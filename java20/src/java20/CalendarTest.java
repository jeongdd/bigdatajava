package java20;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요.");
		int mY = sc.nextInt();
		int mM = sc.nextInt();
		int mD = sc.nextInt();
		Calendar today = Calendar.getInstance();
		int todayY = today.get(Calendar.YEAR);
		int todayM = today.get(Calendar.MONTH) + 1;
		int todayD = today.get(Calendar.DAY_OF_MONTH);
		Calendar birth = Calendar.getInstance(); // 생일의 날짜를 받아오는 변수
		birth.set(mY, mM - 1, mD); // 생일 지정

		System.out.print("오늘은 ");
		System.out.print(today.get(Calendar.YEAR) + "년 ");
		System.out.print(today.get(Calendar.MONTH) + 1 + "월 ");
		System.out.println(today.get(Calendar.DAY_OF_MONTH) + "일 입니다.");

		System.out.println("당신의 나이는 " + (todayY - birth.get(Calendar.YEAR) + 1) + "세 입니다."); // 나이


		int todayYD = today.get(Calendar.DAY_OF_YEAR);
		int birthYD = birth.get(Calendar.DAY_OF_YEAR);

		if (todayYD > birthYD) {
			System.out.println("생일이 " + (todayYD - birthYD) + "일만큼 지났습니다.");
		} else if (todayYD < birthYD) {
			System.out.println("생일이 " + (birthYD - todayYD) + "일 만큼 남았습니다.");
		} else {
			System.out.println("생일축하합니다!!");
		}

		int day = today.get(Calendar.DAY_OF_WEEK);
		String dayS = null;
		switch (day) {
		case 1:
			dayS = "일요일";
			break;
		case 2:
			dayS = "월요일";
			break;
		case 3:
			dayS = "화요일";
			break;
		case 4:
			dayS = "수요일";
			break;
		case 5:
			dayS = "목요일";
			break;
		case 6:
			dayS = "금요일";
			break;
		case 7:
			dayS = "토요일";
			break;
		}

		System.out.print("오늘의 요일은" + dayS + "이고 ");
		int howday = today.get(Calendar.DAY_OF_YEAR);
		float perday = ((float) howday / 365);
		perday = perday * 100;
		System.out.println("올해는 " + howday + "일 지났으며 이는 " + perday + "% 만큼 지났습니다.");
		System.out.println("현지 시간은 " + today.get(Calendar.HOUR_OF_DAY) + "시 " + today.get(Calendar.MINUTE) + "분 입니다.");

	}
}
