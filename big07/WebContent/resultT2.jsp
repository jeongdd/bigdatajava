<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>ResultT2</title>
	</head>
		<%
			String color = request.getParameter("color");
		%>
	<body bgcolor="<%= color %>">
		<h1>입력된 색상 : <%= color %></h1>
	</body>
</html>