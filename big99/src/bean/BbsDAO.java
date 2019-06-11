package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	DBConnectionMgr mgr;

	public BbsDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(BbsDTO dto) {

		Connection con;
		try {
			con = mgr.getConnection();
			
			String sql = "insert into bbs valuse(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(BbsDTO dto) throws Exception {

		Connection con = mgr.getConnection();

		String sql = "update bbs set id = ?, title = ?, content = ?, etc = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		ps.setString(5, dto.getId());

		ps.executeUpdate();
	}

	public void delete(BbsDTO dto) throws Exception {

		Connection con = mgr.getConnection();

		String sql = "delete from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		ps.executeUpdate();
	}

	public BbsDTO select(BbsDTO dto) throws Exception {

		Connection con = mgr.getConnection();

		// 3단계 sql문 결정
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4단계 sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		BbsDTO dto2 = null;

		while (rs.next()) {
			dto2 = new BbsDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String etc = rs.getString(4);

			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setEtc(etc);
		}
		return dto2;
	}

}
