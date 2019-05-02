package jdbc;

//import java.net.URL;
//import java.sql *; => 많이 사용할 때 말고는 사용 x(데이터 공간을 많이 잡아먹음)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest {

	public static void main(String[] args) throws Exception { //Exception-> 다 처리함
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
		
//		3. SQL 선택
		String id = JOptionPane.showInputDialog("ID 입력");
		String pw = JOptionPane.showInputDialog("PW 입력");
		String name = JOptionPane.showInputDialog("NAME 입력");
		String tel = JOptionPane.showInputDialog("TEL 입력");
		
//		String sql = "insert into member values('win','win','win','win')"; // 여기만 변경하면 계속 db에 전송가능(다른부분은 다 똑같음)
//		String sql = "insert into member values('"+ id + "','" + pw + "','" + name + "','" + tel + "')";
		String sql = "insert into member values(?, ?, ?, ?)"; // ?는 문법적으로 사용되는 키워드 '' -> 사용 X
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql); // 입력값(sql이란 string)을 넣은것을 객체화해서 넘겨줌
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 선택 OK...");
		
		
//		# 객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		ps.executeUpdate(); // sql로 연결시켜서 전송해줌
		System.out.println("4. SQL문 전송 OK...");
		
	}

}
































