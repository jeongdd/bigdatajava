package daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDAOC {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	

	public void insert(String inId, String inTitle, String inContent, String inEtc) {
		BbsDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok!!");
			
			// 2. DB연결
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password); // Stream생성 (네트워크 통신 가능)
			// ↑ 받아와야함  con이 null 상태이기 때문에
			System.out.println("2. DB연결 ok!!");
			
			// #3
			String sql = "insert into bbs values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, inId);
			ps.setString(2, inTitle);
			ps.setString(3, inContent);
			ps.setString(4,inEtc);
			System.out.println("sql문 객체화!");
			
			//#4
			rs = ps.executeQuery();
			System.out.println("전송완료!");
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
			
		} catch (Exception e) {
			System.out.println("DB 처리 중 에러 발생!");
			System.out.println(e.getMessage());
		}
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원해제 중 에러발생!");
//			e.printStackTrace();
			}
			
	}
	
}





































