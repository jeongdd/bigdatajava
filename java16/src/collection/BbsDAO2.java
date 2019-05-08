package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import collection.BbsDTO;

public class BbsDAO2 {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	// CRUD
	// 각각을 메소드로 만들어야 한다.
	//SQL문 select * from where id = ?
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		
		BbsDTO dto = null; // return을 받기 위해서 try밖으로 선언을 빼버림
		// 1. 드라이버 설정
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
			
			// 3. SQL문 결정(객체화)
			String sql = "select * from bbs";  // 조건이 없으면 setString도 지워야함!!!
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 객체화 ok!!");
			
			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 ok!!");
			// 5. SQL문 결과가 있으면 받아서 처리
			while(rs.next()) { // while이 돌 때 마다 dto가 생성되고 ArrayList에 붙이게 됨
				dto = new BbsDTO();  //기본생성자 만들어줘야함
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				list.add(dto); //dto의 주소
				
			}//while end	
			
		} catch (Exception e) { // 다 잡아버림 -> 모든 에러처리
			System.out.println("DB처리 중 에러 발생...");
			System.out.println(e.getMessage());
		} finally {
			// 에러 발생여부와 상관없이 무조건 실행해야 하는 코드 (강제성)
			// 작은 범위부터 close해야함
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println("자원 해제 중 에러발생!!!");
			} // catch
		} // try-catch-finally
		
		return list;
	}
	
	public BbsDTO select(String inputId) { // 변수의 생존범위 : 선언의 위치
		BbsDTO dto = null; // return을 받기 위해서 try밖으로 선언을 빼버림
		// 1. 드라이버 설정
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
			
			// 3. SQL문 결정(객체화)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 객체화 ok!!");
			
			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 ok!!");
			// 5. SQL문 결과가 있으면 받아서 처리
			if(rs.next()) { // 각각의 cursor에서 옮기는 역할 next()
				dto = new BbsDTO();  //기본생성자 만들어줘야함
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
			
		} catch (Exception e) { // 다 잡아버림 -> 모든 에러처리
			System.out.println("DB처리 중 에러 발생...");
			System.out.println(e.getMessage());
		} finally {
			// 에러 발생여부와 상관없이 무조건 실행해야 하는 코드 (강제성)
			// 작은 범위부터 close해야함
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println("자원 해제 중 에러발생!!!");
			} // catch
		} // try-catch-finally
		return dto;
	} // select method
} //class



















































