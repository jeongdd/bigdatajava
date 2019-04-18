package control;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		/* 오늘 아침에 대한 정보 출력 (변수에 저장해서 출력)
		 * --------------------
		 * 오늘 아침을 먹고 왔나요? : true
		 * 오늘 타고 온 버스의 번호나 지하철 노선은? 2호선
		 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는: 5
		 * 오늘부터 프로젝트를 함께 할 조원의 이름은 : 
		 */
		Scanner sc = new Scanner(System.in);
		double ytem = 10.5;
		double ttem = 5.5;
		
		System.out.println("오늘 아침에 대한 정보 출력");
		System.out.println("--------------------");
		
		System.out.print("오늘 아침을 먹고 왔나요:");
		boolean eat = sc.nextBoolean();
		
		System.out.print("오늘 타고 온 버스의 번호나 지하철 노선은 :");
		int sub = sc.nextInt();
		System.out.println("오늘 타고 온 버스의 번호나 지하철 노선은 :" + sub + "호선");
		
		System.out.print("오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는:");
		System.out.println(ytem-ttem);
		
		
		System.out.print("오늘부터 프로젝트를 함께 할 조원의 이름은: ");
		String name = sc.next();
		System.out.print("오늘부터 프로젝트를 함께 할 조원의 이름은: " + name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
