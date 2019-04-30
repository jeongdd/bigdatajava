package constructor;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ShoppingMall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Memeber memebers[] = new Memeber[3]; 
		
		System.out.println("가입할 정보를 입력해 주세요.");
		for (int i = 0; i < memebers.length; i++) {
			
			System.out.print("가입할 이름 : ");
			String name = sc.next();
			System.out.print("가입할 나이 : ");
			int age = sc.nextInt();
			System.out.print("가입할 번호 : ");
			String tel = sc.next();
			System.out.print("가입할 주소 : ");
			String addr = sc.next();
			
			memebers[i] = new Memeber(name, age, tel, addr);
		}
		
		System.out.println("쇼핑몰 회원가입 명단입니다.");
		System.out.println("===============================");
		System.out.println("이름	나이	연락처	  주소");
		System.out.println("-------------------------------");
	
		for (int i = 0; i < memebers.length; i++) {
			System.out.println(memebers[i].name + "	" + memebers[i].age + "	" +
						memebers[i].tel + "	" + memebers[i].addr + "	");
			System.out.println();
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
