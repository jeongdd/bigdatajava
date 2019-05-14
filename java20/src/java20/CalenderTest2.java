package java20;

import java.util.Calendar;

public class CalenderTest2 {

   public static void main(String[] args) {
      // 1970년 1월 1일부터 특정 값에 대한 조작이 가능하게 제공

      Calendar today = Calendar.getInstance();
      // 현재 날짜 시간 값을 받아옴

      Calendar myday = Calendar.getInstance();
      myday.set(1992, 11, 24);

      int myage = today.get(Calendar.YEAR) - myday.get(Calendar.YEAR);
      System.out.println("제 나이는 " + myage + "살 입니다.");
      // 나이 계산

      System.out.print(today.get(Calendar.YEAR) + "년 ");
      System.out.print(today.get(Calendar.MONTH) + 1 + "월 ");
      System.out.println(today.get(Calendar.DAY_OF_MONTH) + "일");

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

      System.out.print(dayS + "이며 ");
      int howday = today.get(Calendar.DAY_OF_YEAR);
      float perday = ((float) howday / 365);
      perday = perday * 100;
      System.out.println("올해는 " + howday + "일 지났으며 이는 " + perday + "% 만큼 지났습니다.");
      System.out.println("현지 시간은 " + today.get(Calendar.HOUR) + "시 " + today.get(Calendar.MINUTE) + "분 입니다.");
  
   }

}

