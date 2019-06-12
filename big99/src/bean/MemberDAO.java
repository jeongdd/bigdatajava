package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MemberDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBConnectionMgr mgr;
	
	public MemberDAO() throws Exception {
		// 1,2 단계를 해주는 DBConnectionMgr 객체 필요
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(MemberDTO dto) throws Exception {
		
		Connection con = mgr.getConnection();
		
		// 3단계 sql문 결정
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		// 4단계 sql문 실행 요청
		ps.executeUpdate();
	}
	
	public void update(MemberDTO dto) throws Exception {

		Connection con = mgr.getConnection();

		// 3단계 sql문 결정
		String sql = "update member set id = ?, pw = ? , name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getId());

		// 4단계 sql문 실행 요청
		ps.executeUpdate();
	}
	
	public MemberDTO select(MemberDTO dto) throws Exception {
		
		Connection con = mgr.getConnection();
		
		// 3단계 sql문 결정
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		// 4단계 sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		MemberDTO dto2 = null;
		
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
		}
		return dto2;
	}

	public ArrayList<MemberDTO> selectAll() throws Exception { // 회원정보 전체 검색
		// => object로 형변환 x -> MemberDTO로 사용한다.
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDTO dto = null;

		con = mgr.getConnection();

		String sql = "select * from member";
		ps = con.prepareStatement(sql);

		rs = ps.executeQuery();
		
		

		while (rs.next()) {
			dto = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel =  rs.getString(4);
			
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);

			list.add(dto);

		} // while end

		return list;

	} // select end
}






















