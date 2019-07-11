package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping("insert")
	public void insert(String id, String pw,String name,String age) {
		System.out.println("회원가입 처리 완료.");
		System.out.println("회원의 정보 : " + id + pw + name + age);
	}
	
	@RequestMapping("insert2")
	public void insert2(MemberDTO memberDTO, MemberDAO memberDAO) {
		memberDAO.insert2(memberDTO);
		
	}
	
	/* @RequestMapping("delete") public void delete(MemberDTO memberDTO, MemberDAO memberDAO) { 
	 * memberDAO.delete(memberDTO);
	 * 
	 * }
	 */
}
