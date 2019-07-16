package com.itbank.mvc88;

import org.mybatis.spring.SqlSessionTemplate;

public class MemberDAO {
	
	SqlSessionTemplate mybatis;
	
	 public MemberDAO(SqlSessionTemplate myBatis) {
	      this.mybatis = myBatis;
	   }
	   
	   public void insert(MemberDTO memberDTO) {
	      mybatis.insert("mDAO.insert", memberDTO);
	   }
}
