<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Basket1</title>
		
	</head>
	<body>
		<%
			String pId = request.getParameter("pId");
			String price = request.getParameter("price");
			
			Cookie cookie = new Cookie(pId,price);
			response.addCookie(cookie);
			
		%>
		
	</body>
</html>










