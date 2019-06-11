package music;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class BoardDAO {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBConnectionMgr mgr;
	static int num = 1;

	public BoardDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(BoardDTO dto) throws Exception {
		Connection con = mgr.getConnection();

		String sql = "insert into board values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, num);
		num++;
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getId());
		ps.setString(4, dto.getPass());
		ps.setString(5, dto.getContent());

		ps.executeUpdate();

	}
	
	public void update(BoardDTO dto) throws Exception {
		Connection con = mgr.getConnection();

		String sql = "update board set title = ?, id = ?, pass = ?, content = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getId());
		ps.setString(3, dto.getPass());
		ps.setString(4, dto.getContent());
		ps.setString(5, dto.getId());
		
		ps.executeUpdate();
	}
	
	public void delete(BoardDTO dto) throws Exception {

		Connection con = mgr.getConnection();

		String sql = "delete from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		ps.executeUpdate();
	}
	
	public BoardDTO select(BoardDTO dto) throws Exception {

		Connection con = mgr.getConnection();

		// 3단계 sql문 결정
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4단계 sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		BoardDTO dto2 = null;

		while (rs.next()) {
			dto2 = new BoardDTO();
			String title = rs.getString(1);
			String id = rs.getString(2);
			String content = rs.getString(3);
			

			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
		}
		return dto2;
	}
	
}


























