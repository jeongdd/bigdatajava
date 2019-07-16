package com.itbank.mvc88;

import org.mybatis.spring.SqlSessionTemplate;

public class BbsDAO {
	
	SqlSessionTemplate mybatis;
	
	public BbsDAO(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public void insert(BbsDTO bbsDTO) {
		mybatis.insert("bDAO.insert",bbsDTO);
	}
}
