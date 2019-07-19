package com.itbank.mvc09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberSelectController {
	
	@Autowired
	//@Qualifier("dao1") => 사용할 객체가 두 개인 경우 이름으로 검색
	MemberDAO dao;
	
	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO, Model model) {  //view까지 넘어감
		MemberDTO dto = dao.select(memberDTO);  //MemberDTO dto => 모델 객체로 넘겨줘야함
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAll.do")
	public void selectAll(Model model) {
		List<MemberDTO> list =  dao.selectAll();
		model.addAttribute("list", list);
	}
}
