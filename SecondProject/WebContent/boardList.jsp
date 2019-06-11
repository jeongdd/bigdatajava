<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
			crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
			integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" 
			crossorigin="anonymous"></script>
	</head>
	<body>
		<jsp:useBean id="dto" class="music.BoardDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
			
		%>
	
	
		<form action="write.jsp">
			<button type="submit" class="btn btn-secondary">글 쓰기</button>
		</form>
	</body>
</html>