<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>구성요소</title>
	</head>
	<body>
		<!-- 선언문  -->
		<%!
			String name;
			public String test(){
				return 1000 + "원";
			}
		%>
		<!-- 스크립트릿   : ; 필수로 붙여야함-->
		<%
			String test = "test"; //지역변수 : 값 초기화 필수
		/* PrintWriter out = new PrintWriter(); */
			out.print(100 + 200 + "<br>");
		%>
		<!-- 표현식  : ; 안붙임 -->
		<%= 100+200 %><br>
		<%= name %>, <%= test %><br>
		<%= test() %>
	</body>
</html>