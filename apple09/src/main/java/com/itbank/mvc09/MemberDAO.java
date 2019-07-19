package com.itbank.mvc09;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//다른 annotation을 만들 땐  : @Service => @Component의 자식 /@Repository도;
@Repository   //annotation으로 db용 bean만들 때
public class MemberDAO {
	
	@Autowired  //SqlSession 타입으로 찾음 이름으로 찾는게 아님
	SqlSessionTemplate myBatis;
	
	public void insert(MemberDTO memberDTO) {
		myBatis.insert("mDAO.insert", memberDTO);
		System.out.println("myBatis호출");
	}
	
	public void delete(MemberDTO memberDTO) {
		myBatis.delete("mDAO.delete", memberDTO);
	}
	
	public void update(MemberDTO memberDTO) {
		myBatis.update("mDAO.update", memberDTO);
	}
	
	public MemberDTO select(MemberDTO memberDTO) {
		return myBatis.selectOne("mDAO.select", memberDTO);
	}
	
	public List<MemberDTO> selectAll() {
		return myBatis.selectList("mDAO.selectAll");
	}
}
