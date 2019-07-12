package com.itbank.mvc06;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("bbsInsert")
	public void bbsInsert(BbsDTO bbsDTO, BbsDAO bbsDAO) throws Exception {
		
		bbsDAO.insert(bbsDTO);
		System.out.println("완료");
		
	}
}
