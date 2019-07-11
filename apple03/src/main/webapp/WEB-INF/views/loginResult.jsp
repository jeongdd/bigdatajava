<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body style="color: yellowgreen; font-weight: bold;">
		<h1 style="color: salmon">로그인 처리 완료</h1>
		<img src="resources/thanks.jpeg"><br>
		${result}<br>
		
		${memberDTO.id}<br>
		${memberDTO.pw}<br>
		${memberDTO.name}<br>
		${memberDTO.age}<br>
		
		${list}<br>
		
	</body>
</html>