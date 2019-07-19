package com.itbank.mvc99;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BbsDTO bbsDTO) {
		my.insert("bDAO.insert", bbsDTO);
		System.out.println("mybatist호출 완료");
	}
	
	public void delete(BbsDTO bbsDTO) {
		my.delete("bDAO.delete", bbsDTO);
	}
	
	public void update(BbsDTO bbsDTO) {
		my.update("bDAO.update", bbsDTO);
	}
	
	public BbsDTO select(BbsDTO bbsDTO) {
		return my.selectOne("bDAO.select", bbsDTO);
	}
	
	public List<BbsDTO> selectAll() {
		return my.selectList("bDAO.selectAll");
	}
}
