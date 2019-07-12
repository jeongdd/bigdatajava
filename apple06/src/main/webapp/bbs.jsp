<%@page import="com.itbank.mvc06.BbsDTO"%>
<%@page import="com.itbank.mvc06.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			BbsDAO dao = new BbsDAO();
			BbsDTO dto = new BbsDTO();
			
			dto.setId("300");
			dto.setTitle("oracle");
			dto.setContent("love oracle");
			dto.setWriter("jeong");
			
			dao.insert(dto);
			
		%>
	</body>
</html>