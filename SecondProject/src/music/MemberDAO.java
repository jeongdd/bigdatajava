package music;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import music.DBConnectionMgr;
import music.MemberDTO;

public class MemberDAO {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBConnectionMgr mgr;

	public MemberDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(MemberDTO dto) throws Exception {

		con = mgr.getConnection();

		String sql = "insert into member values(?,?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getGender());
		ps.setString(5, dto.getBirth());
		ps.setString(6, dto.getEmail());

		ps.executeUpdate();

	}

	public void LoginCheck(String InputId, String InputPw) throws Exception {

		MemberDTO dto = null;

		con = mgr.getConnection();

		String sql = "select * from member where id = ? and pw = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, InputId);
		ps.setString(2, InputPw);

		rs = ps.executeQuery();

		boolean check = false;

		if (rs.next()) {
			check = true;
		} else {
			check = false;
		}

	}

	public MemberDTO select(MemberDTO dto) {

		Connection con;
		MemberDTO dto2 = null;
		try {
			con = mgr.getConnection();
			// 3단계 sql문 결정
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());

			// 4단계 sql문 실행 요청
			rs = ps.executeQuery();

			while (rs.next()) {
				dto2 = new MemberDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String gender = rs.getString(4);
				String birth = rs.getString(5);
				String email = rs.getString(6);

				dto2.setId(id);
				dto2.setPw(pw);
				dto2.setName(name);
				dto2.setGender(gender);
				dto2.setBirth(birth);
				dto2.setEmail(email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dto2;
	}

	public ArrayList selectAll() throws Exception { // 회원정보 전체 검색

		ArrayList list = new ArrayList();
		MemberDTO dto = null;

		con = mgr.getConnection();

		System.out.println("DB 연결 완료");

		String sql = "select * from music";
		ps = con.prepareStatement(sql);

		rs = ps.executeQuery();
		System.out.println("전송 완료");
		System.out.println("--------------");

		while (rs.next()) {
			dto = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String gender = rs.getString(4);
			String birth = rs.getString(5);
			String email = rs.getString(6);

			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setGender(gender);
			dto.setBirth(birth);
			dto.setEmail(email);

			list.add(dto);

		} // while end

		rs.close();
		ps.close();
		con.close();

		return list;

	} // select end
}
