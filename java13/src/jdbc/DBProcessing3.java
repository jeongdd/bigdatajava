package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBProcessing3 {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	//멤버 메소드
	public void update(String tel, String id) throws Exception {
//		1. 드라이버 설정
		//파일을 다룰 땐 예외처리를 해줘야한다.
		Class.forName("com.mysql.jdbc.Driver"); // 사용할 떄 올려줌
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
//		3. data 수정
		String sql = "update member set tel = ? where id = ?";
		ps = con.prepareStatement(sql);
		System.out.println(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		ps.executeUpdate();
	}
	
}































