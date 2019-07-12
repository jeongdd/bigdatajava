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
		<form action="bbsInsert">
			id : <input type="text" name="id"><br>
			title : <input type="text" name="title"><br>
			content : <input type="text" name="content"><br>
			writer : <input type="text" name="writer"><br>
			<button type="submit">등록</button>
		</form>
	</body>
</html>