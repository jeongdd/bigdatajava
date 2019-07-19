package com.itbank.mvc99;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(ReplyDTO replyDTO) {
		my.insert("cDAO.insert",replyDTO);
	}
	
	public ReplyDTO select(ReplyDTO replyDTO) {
		return my.selectOne("cDAO.select", replyDTO);
	}
	
	public List<ReplyDTO> selectAll() {
		return my.selectList("cDAO.selectAll");
	}
}
