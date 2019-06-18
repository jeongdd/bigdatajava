<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>CookieView</title>
		
	</head>
	<body>
				
		<%
			Cookie[] cookies = request.getCookies();
			for(Cookie c : cookies){
				String name = c.getName();
				String value = c.getValue();
				if(!(name.equals("JSESSIONID"))){
					out.write("제품 명 :" + name + ", 제품 가격 :" + value + "<br>");
					out.write("<hr>");
				}
			}
		%>
		
	</body>
</html>