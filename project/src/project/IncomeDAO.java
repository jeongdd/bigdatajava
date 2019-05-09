package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncomeDAO {
	String url = "jdbc:mysql://localhost:3306/wallet";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	static int num = 0;
	
	public void insertIncome(IncomeDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok!!");
			
			con = DriverManager.getConnection(url, user, password); // Stream생성 (네트워크 통신 가능)
			System.out.println("2. DB연결 ok!!");
			
			String sql = "insert into income values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			num++;
			ps.setString(2, dto.getDate());
			ps.setInt(3, dto.getIncome());
			String cateC = dto.getCategory();
			if (cateC.equals("월       급")) {
				cateC = "salary";
			} else if(cateC.equals("용       돈")) {
				cateC = "allow";
			} else {
				cateC = "etc";
			}
			ps.setString(4, cateC);
			ps.setString(5, dto.getMemo());
					
			System.out.println("객체화 완료!");
			
			ps.executeUpdate();
			System.out.println("전송 완료!");
			
			
		} catch (Exception e) {
			System.out.println("DB처리 중 에러 발생...");
			System.out.println(e.getMessage());
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //end finally
	}
}


































