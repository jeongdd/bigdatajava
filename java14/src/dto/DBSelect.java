package dto;

import java.util.Scanner;

public class DBSelect {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("----회원 가입 정보 입력 ----");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		System.out.print("TEL : ");
		String tel = sc.next();
		
		SelectProcessing db = new SelectProcessing();
		
		
		MemberDTO dto = new MemberDTO();
		
		try{
			db.select(dto);
		}catch(Exception e){
			System.out.println("Error!!Error!!");
			e.printStackTrace();
		}

		sc.close();
	}

}
