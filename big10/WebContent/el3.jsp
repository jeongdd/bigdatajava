<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 화면</title>
	</head>
	<body>
		<h1>회원가입 화면입니다.</h1>
		<hr color="red">
		<form action="member.jsp">
			아이디 : <input type="text" name="id"><br>
			비밀번호 : <input type="password" name="pw"><br>
			이름 : <input type="text" name="name"><br>
			전화번호 : <input type="text" name="tel"><br>
			<input type="submit" value="서버로 전송">
		</form>
	</body>
</html>