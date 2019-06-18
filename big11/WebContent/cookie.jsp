<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cookie</title>
	</head>
	<body>
		<%
			Cookie cookie = new Cookie("hi","cookiehello...");
			response.addCookie(cookie);
			
			Cookie cookie2 = new Cookie("subject","jsp");
			response.addCookie(cookie2);
			
			Cookie cookie3 = new Cookie("name","hong");
			response.addCookie(cookie3);
			
			Cookie cookie4 = new Cookie("JSESSIONID","00");
			response.addCookie(cookie4);
			cookie4.setMaxAge(0);
		%>
	<jsp:forward page="cookie2.jsp"></jsp:forward>
	</body>
</html>