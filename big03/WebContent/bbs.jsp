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
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String user = request.getParameter("user");
			String password = request.getParameter("password");
		%>
		게시판 등록 글
		<hr>
		TITLE : <%= title %><br>
		CONTENT : <%= content %><br>
		USER : <%= user %><br>
		PASSWORD : <%= password %><br>
	</body>
</html>