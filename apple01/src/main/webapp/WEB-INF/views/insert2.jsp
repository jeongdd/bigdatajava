<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="yellow">
		<h1>등록하신 회원정보 입니다.</h1>
		<h3>ID : ${memberDTO.id}</h3>
		<h3>PW : ${memberDTO.pw}</h3>
		<h3>NAME : ${memberDTO.name}</h3>
		<h3>AGE : ${memberDTO.age}</h3>
	</body>
</html>