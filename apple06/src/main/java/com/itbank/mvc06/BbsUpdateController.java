package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUpdateController {

	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("update")
	public String bbsUpdate(BbsDTO bbsDTO) throws Exception {
		bbsDAO.update(bbsDTO);
		
		return "selectView";
	}
}
