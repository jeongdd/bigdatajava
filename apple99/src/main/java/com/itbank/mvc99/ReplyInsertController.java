package com.itbank.mvc99;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyInsertController {

	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("insertR")
	public String name(ReplyDTO replyDTO) {
		dao.insert(replyDTO);
		return "insertR";
	}
}
