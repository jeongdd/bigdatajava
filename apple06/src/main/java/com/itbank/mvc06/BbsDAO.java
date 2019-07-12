package com.itbank.mvc06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

@Repository
public class BbsDAO {
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	// 기본 생성자
	// 생성자: 객체 생성시 자동 호출되는 메소드
	// 객체생성시 꼭 해주어야하는 초기화 과정
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}

	public void insert(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		// 3. SQL문 객체화
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());

		// 4. SQL문 실행 요청
		ps.executeUpdate();
	}

	public void delete(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		String sql = "delete from bbs where id = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());

		ps.executeUpdate();
	}

	public BbsDTO select(String InputId) throws Exception {
		con = dbcp.getConnection();

		BbsDTO bbsDTO = null;

		String sql = "select * from bbs where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1,InputId);
		rs = ps.executeQuery();
		if (rs.next()) {
			bbsDTO = new BbsDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			
			bbsDTO.setId(id);
			bbsDTO.setTitle(title);
			bbsDTO.setContent(content);
			bbsDTO.setWriter(writer);
		}
		return bbsDTO;

	}

	public void update(BbsDTO bbsDTO) throws Exception {
		con = dbcp.getConnection();

		String sql = "update bbs set title =?, content = ?, writer = ? where id = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, bbsDTO.getTitle());
		ps.setString(2, bbsDTO.getContent());
		ps.setString(3, bbsDTO.getWriter());
		ps.setString(4, bbsDTO.getId());
		
		ps.executeUpdate();

	}
}
