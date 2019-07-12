package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsDeleteController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("delete")
	public void bbsDelete(BbsDTO bbsDTO, BbsDAO bbsDAO) throws Exception {
	
		bbsDAO.delete(bbsDTO);
		System.out.println("삭제완료");
	}
}
