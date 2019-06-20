<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="org.omg.CORBA.PUBLIC_MEMBER"%>
<%@page import="bean.DBConnectionMgr"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	
	Class.forName("com.mysql.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/music";
	String user = "root";
	String password = "1234";
	Connection con = DriverManager.getConnection(url,user,password); 
	
	String sql = "select * from member where id = ?";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id);
	ResultSet rs = ps.executeQuery();
	
	if(rs.next() == true){
		out.write("사용할 수 없는 아이디 입니다.");
	}else{
		out.write("사용할 수 있는 아이디 입니다.");
	}
	
	
%>