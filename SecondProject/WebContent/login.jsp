<%@page import="music.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login Page</title>
	</head>
	<body>
		<%
			String InputId = request.getParameter("id");
			String InputPw = request.getParameter("pw");
		
			MemberDAO dao = new MemberDAO();
			dao.LoginCheck(InputId, InputPw);
		
		%>
	
		<center>
			<h1>환영합니다~</h1>
			<hr color="yellow" size="5">
			<form action="main.jsp">
				ID : <input type="text" name="id"> <br>
				PW : <input type="password" name="pw"> <br>
				<input type="submit" value="로그인">
				<a href = "signIn.html"><input type="button" value="회원가입"></a>
			</form>
		
		</center>
	</body>
</html>