package com.itbank.mvc99;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyselectController {
	@Autowired
	ReplyDAO dao;

	@Autowired
	BbsDAO dao2;
	
	
	@RequestMapping("selectAllR")
	public String selectAll(Model model) {
		
		List<ReplyDTO> list2 = dao.selectAll();
		List<BbsDTO> list11 = dao2.selectAll();
		model.addAttribute("list11", list11);
		model.addAttribute("list2", list2);
		return "selectAll";
	}
}
