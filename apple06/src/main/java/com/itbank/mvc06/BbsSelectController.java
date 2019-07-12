package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {

	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("select")
	public String bbsSelect(BbsDTO bbsDTO, Model model) throws Exception {
		
		bbsDTO = bbsDAO.select(bbsDTO.getId());
		
		model.addAttribute("bbsDTO", bbsDTO);
		
		return "update";
	}
}


