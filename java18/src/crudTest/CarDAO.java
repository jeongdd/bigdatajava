package crudTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarDAO {
	String url = "jdbc:mysql://localhost:3306/car";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	//insert
	public void insert(CarDTO dto) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 완료!");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 완료!");
			
			String sql = "insert into carSale values(?,?,?,?)";
			ps = con.prepareStatement(sql);

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setInt(4, dto.getPrice());
			
			System.out.println("객체화 완료!");
			
			ps.executeUpdate();
			System.out.println("전송완료!");
			
	
	} // end insert
	
	//update
	public void update(CarDTO dto) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 완료!");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 완료!");
			
			String sql = "update carSale set price = ? where id = ?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, dto.getPrice());
			ps.setString(2, dto.getId());
			
			System.out.println("객체화 완료!");
			
			ps.executeUpdate();
			System.out.println("전송완료!");
			
			
	} // end update
	
	//delete
	public void delete(CarDTO dto) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 완료!");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 완료!");
			
			String sql = "delete from carSale where name = ?";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getName());
			
			System.out.println("객체화 완료!");
			
			ps.executeUpdate();
			System.out.println("전송완료!");
			
		
	} // end update
	
	// selectAll
	public ArrayList selectAll() throws Exception {
		ArrayList list = new ArrayList();
		CarDTO dto = null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 완료!");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 완료!");
			
			String sql = "select * from carSale";
			ps = con.prepareStatement(sql);
			System.out.println("객체화 완료!");
			
			rs = ps.executeQuery();
			System.err.println("전송 완료!");
		
			while(rs.next()) {
				dto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				int price = rs.getInt(4);
				
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				
				list.add(dto);
			}
			
		return list;
	} // end selectAll
	
}






































