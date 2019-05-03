package daoEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberUpdate {

	//멤버변수
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	public void update(String pw, String id) throws Exception {
		
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/wallet";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
//		3. 회원정보 수정
		String sql = "update member set pw = ? where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, id);
		ps.executeUpdate();
		System.out.println("SQL문 수정 완료!");
		
	}
}
