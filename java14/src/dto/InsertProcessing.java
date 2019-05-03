package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertProcessing {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	//멤버 메소드
	public void insert(MemberDTO dto) throws Exception { //dto 클래스를 지정
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		

		
		String sql = "insert into member valuse(?,?,?,?)";
		ps = con.prepareStatement(sql);
		System.out.println(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		System.out.println("3. SQL문 선택 OK...");
		
		
//		4. SQL 전송
		ps.executeUpdate(); 
		System.out.println("4. SQL문 전송 OK...");
	
	}


	
}

































