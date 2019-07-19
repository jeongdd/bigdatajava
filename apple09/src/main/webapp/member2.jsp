<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="insert.do">
			아이디 : <input type="text" name="id"><br>
			패스워드 : <input type="password" name="pw"><br>
			이름 : <input type="text" name="name"><br>
			나이 : <input type="text" name="age"><br>
			<button type="submit">서버로 전송</button>
		</form>
		<br>
		<hr>
		<h1 style="color: salmon">아이디 검색</h1>
		<form action="select.do">
			아이디 : <input type="text" name="id"><br>
			<button type="submit">검색</button>
		</form>
		<br>
		<hr>
		<a href="selectAll.do">전체 검색</a>		
	</body>
</html>