<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="insert">
			아이디 : <input type="text" name="id"><br>
			제목 : <input type="text" name="title"><br>
			내용 : <input type="text" name="content"><br>
			작성자 : <input type="text" name="writer"><br>
			<button type="submit">서버로 전송</button>
		</form>
		<hr size="5" color="yellowgreen">
		<form action="select">
			아이디 : <input type="text" name="id"><br>
			<button type="submit">검색</button>
		</form>
		<hr size="5" color="salmon">
		<a href="selectAllR">전체 리스트 검색</a>
		
	</body>
</html>