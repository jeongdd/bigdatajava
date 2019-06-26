package music;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.catalina.Session;

public class BoardDAO {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBConnectionMgr mgr;

	public BoardDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(BoardDTO dto) throws Exception {

		con = mgr.getConnection();
		System.out.println(1);
		String sql = "insert into board values(null,?,?,?,?)";
		ps = con.prepareStatement(sql);
		System.out.println(dto.getId());

		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getId());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getDate());

		ps.executeUpdate();
		System.out.println(3);
	}

	public void update(BoardDTO dto) throws Exception {
		con = mgr.getConnection();

		String sql = "update board set title = ?, id = ?, pass = ?, content = ? where id = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getId());
		ps.setString(4, dto.getContent());
		ps.setString(5, dto.getId());

		ps.executeUpdate();
	}

	public void delete(BoardDTO dto) throws Exception {

		con = mgr.getConnection();

		String sql = "delete from board where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		ps.executeUpdate();
	}

	public BoardDTO select(BoardDTO dto) throws Exception {

		con = mgr.getConnection();

		String sql = "select * from bbs where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		rs = ps.executeQuery();
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

	public ArrayList<BoardDTO> selectAll() {

		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		BoardDTO dto = null;

		try {
			con = mgr.getConnection();
			
			String sql = "select * from board";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {

				dto = new BoardDTO();
				int num = rs.getInt(1);
				String title = rs.getString(2);
				String id = rs.getString(3);
				String content = rs.getString(4);
				String date = rs.getString(5);

				dto.setNum(num);
				dto.setTitle(title);
				dto.setId(id);
				dto.setContent(content);
				dto.setDate(date);

				list.add(dto);
				
			} // while end

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	} // selectAll end

}
