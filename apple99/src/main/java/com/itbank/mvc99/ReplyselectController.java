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

	@RequestMapping("selectAllR")
	public String selectAll(Model model) {
		List<ReplyDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "selectAllR";
	}
}
