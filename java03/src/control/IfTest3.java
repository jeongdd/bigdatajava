package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//# 3-1 
		while(true) {
			System.out.print("두 수를 입력하세요.");
			 double num1 = sc.nextDouble();
			 double num2 = sc.nextDouble();
			 
			 if(num1 > num2) {
				 System.out.println("두 수 중 더 큰 수는 " + num1 + "입니다.");
			 }else {
				 System.out.println("두 수 중 더 큰 수는 " + num2 + "입니다.");
			 } // else end.
		
		//# 3-2
		 
			 System.out.print("두 수를 입력하세요.");
			 double num3 = sc.nextDouble();
			 double num4 = sc.nextDouble();
			
			 System.out.println(num3 + num4);
			 System.out.println(num3 - num4);
			 System.out.println(num3 * num4);
			 System.out.println(num3 / num4);
			 
		 } //while end.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	} //main end.

} //class end.
