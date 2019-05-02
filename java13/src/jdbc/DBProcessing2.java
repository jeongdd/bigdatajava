package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBProcessing2 {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	//멤버 메소드
	public void insert(String id, String pw, String name, String tel) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
//		3. SQL 선택
		
//		id = JOptionPane.showInputDialog("ID 입력");
//		pw = JOptionPane.showInputDialog("PW 입력");
//		name = JOptionPane.showInputDialog("NAME 입력");
//		tel = JOptionPane.showInputDialog("TEL 입력");
		
		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		System.out.println(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 선택 OK...");
		
		
//		4. SQL 전송
		ps.executeUpdate(); 
		System.out.println("4. SQL문 전송 OK...");
	}
//	public void update(String tel, String id) throws Exception {
//		String sql = "update member set tel = ? where id = ?";
//		ps = con.prepareStatement(sql);
//		System.out.println(sql);
//		ps.setString(1, tel);
//		ps.setString(2, id);
//		ps.executeUpdate();
//	}
//	public void delete(String id) throws Exception {
//		String sql = "delete from member where id = win";
//		ps.setString(1, id);
//		ps.executeUpdate();
//	}

}































