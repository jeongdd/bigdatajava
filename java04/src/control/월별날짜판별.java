package control;

import java.util.Date;

public class 월별날짜판별 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() +1 ; // .getmonth => 현재달 - 1달
						
		int result = 0; //String result = "";
		
				
		switch(month) {
		case 2:
			System.out.println("28일 까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일 까지 있습니다.");
			break;	
		default :
			System.out.println("31일까지 있습니다.");
		/*case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31; (=> 간단한걸 default로 두는것이 좋음)
			break;
		case 4: case 6: case 9: case 11:
			result = 30;
			break;	
		default :
			result = 28;
		*/
			
		}
		
//		System.out.println("지금은 " + month + "월 " + result + "일인 달 입니다.");
		
		}
		

	}


