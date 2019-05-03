package daoEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	//멤버변수
		Connection con;
		PreparedStatement ps;
		String url;
		String user;
		String password;
		static int num = 0;
	
	public void insert(MemberDTO dto) throws Exception {
//		1. 드라이버 설정
		//파일을 다룰 땐 예외처리를 해줘야한다.
		Class.forName("com.mysql.jdbc.Driver"); // 사용할 떄 올려줌
		System.out.println("드라이버 설정 OK...");
		
//		2. DB연결(DB명, id, pw)
		String url = "jdbc:mysql://localhost:3306/wallet";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("DB연결 OK...");
		
//		3. 회원정보 입력
		dto.setId(MemberMain.id); //not null 
		dto.setPw(MemberMain.pw);
		dto.setName(MemberMain.name);
		dto.setEmail(MemberMain.email);
		dto.setHome(MemberMain.home);
		dto.setGender(MemberMain.gender);
		dto.setAge(MemberMain.age);
		String sql = "insert into member values(?,?,?,?,?,?,?,?)";
		ps= con.prepareStatement(sql);
		
		ps.setInt(1, num);
		num++;
		ps.setString(2, dto.getId());
		System.out.println(dto.getId());
		ps.setString(3, dto.getPw());
		ps.setString(4, dto.getName());
		ps.setString(5, dto.getEmail());
		ps.setString(6, dto.getHome());
		ps.setString(7, dto.getGender());
		ps.setInt(8, dto.getAge());
		System.out.println("SQL 선택  OK!!");
		
//		4. SQL문 전송
		ps.executeUpdate();
		System.out.println("전송완료!");
		
	}
	
}


























