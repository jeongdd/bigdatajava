<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB Test</title>
	</head>
	<body>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			out.write("드라이버 설정 ok");
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			out.write("db 연결 ok");
			
			String sql = "insert into member values(?,?,?,?)";
			
			Statement st = con.createStatement();
			out.write("객체화 ok");
			
		%>
	</body>
</html>