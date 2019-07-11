package com.itbank.mvc03;

public class MemberDAO {
	public void insert2(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		
		System.out.println("암호화 해서 저장된 회원의 정보 : " + memberDTO.getId()); 
		System.out.println("암호화 해서 저장된 회원의 정보 : " + memberDTO.getPw()); 
		System.out.println("저장된 회원의 정보 : " + memberDTO.getName()); 
		System.out.println("저장된 회원의 정보 : " + memberDTO.getAge()); 
	}
}
