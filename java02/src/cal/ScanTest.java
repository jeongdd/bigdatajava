package cal;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		// #4
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은?");
		String name = sc.next();
		
		System.out.print("당신의 태어난 년도는?");
		int year = sc.nextInt();
		int age = 2019 - year + 1;
		
		System.out.print("당신의 관심과목은?");
		String subject = sc.next();
	
		System.out.println("----------------");
		
		System.out.println(name +"님은 " + age +"살이고, " + subject + "에 관심있습니다.");
		System.out.println("정확한 나이는 " + age);
		
		
		
		
	}

}
