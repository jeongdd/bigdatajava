package jdbc;

//import java.net.URL;
//import java.sql *; => 많이 사용할 때 말고는 사용 x(데이터 공간을 많이 잡아먹음)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest2 {

	public static void main(String[] args) throws Exception { 
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
//		3. SQL 선택
		
		String id = JOptionPane.showInputDialog("ID 입력");
		String title = JOptionPane.showInputDialog("TITLE 입력");
		String price = JOptionPane.showInputDialog("PRICE 입력");
		String company = JOptionPane.showInputDialog("COMPANY 입력");
		
		String sql = "insert into product values('"+ id + "','" + title + "','" + price + "','" + company + "')";
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql); 
		System.out.println("3. SQL문 선택 OK...");
		
		
//		4. SQL 전송
		ps.executeUpdate(); 
		System.out.println("4. SQL문 전송 OK...");
		
	}

}
































