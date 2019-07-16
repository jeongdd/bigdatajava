package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsUser {
	
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		BbsDAO dao = (BbsDAO)factory.getBean("bbsDAO");
		BbsDTO bbsDTO = new BbsDTO();
		bbsDTO.setId("hi");
		bbsDTO.setTitle("hihi");
		bbsDTO.setContent("hello");
		bbsDTO.setWriter("user");
		
		dao.insert(bbsDTO);
		
	}
}
