package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DialogTest {
	public static void main(String[] args) {
		//#1
		// 다이얼로그에서 먹고 싶은 음식을 입력받으세요.
		String ff = JOptionPane.showInputDialog("먹고싶은 음식을 입력하세요.");
		// 다이얼로그에서 먹기 싫은 음식을 입력받으세요.
		String hf = JOptionPane.showInputDialog("먹기 싫은 음식을 입력하세요.");
		// 콘솔에 먹고싶은 음식과 먹기싫은 음식 출력
		System.out.println("당신이 먹고 싶은 음식은 :" + ff);
		System.out.println("당신이 먹기 싫은 음식은 :" + hf);
		
		
		//#2 오늘의 치킨가격은 얼마인가요? 입력받으세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 가격을 입력하세요 : ");
		int price = sc.nextInt();
		//	9000원을 넘으면 내일 다시 전화할게요.
		//	아니면, 주문할게요.
		if(price > 9000) {
			System.out.println("내일 다시 전화할게요.");
		}else {
			System.out.println("주문할게요.");
		}
		
		//#3 나와 동생의 나이를 비교해서 
		//	내가 많으면 "내가 떡 2개를 먹어요"
		//	아니면 "동생이 떡 2개를 먹어요"
		System.out.print("나와 동생의 나이를 입력하세요 : ");
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		
		if(age1 > age2) {
			System.out.println("내가 떡 2개를 먹어요");
		}else {
			System.out.println("동생이 떡 2개를 먹어요");
		}
				
		//#4 pi = 3.14 , r = 12
		//	 원의 면적 : pi*r*r
		//	width = 11, height = 22
		//	사각형의 면적 : width*height
		double pi = 3.14;
		int r = 12;
		int width = 11;
		int height = 22;
		
		boolean result;
		boolean rr;
		System.out.println("반지름이 " + r + "인 원의 면적은 :" + (pi * r * r));
		System.out.println("가로가 " + width + ", 세로가 " + height + "인 사각형의 면적은 :" + (width*height));
		
		if(width == height) {
			result = true;
		}else {
			result = false;
		}
		System.out.println("가로 세로가 같은가요?" + result);
		
		if(r > 10) {
			rr = true;
		}else {
			rr = false;
		}
		System.out.println("반지름이 10보다 큰가요? " + rr );
		
		
		
		
	} //main
} //class
