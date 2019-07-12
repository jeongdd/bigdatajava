<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="update">
			id : <input type="text" name="id" value="${bbsDTO.id}" readonly="readonly"><br>
			title : <input type="text" name="title" value="${bbsDTO.title}"><br>
			content : <input type="text" name="content" value="${bbsDTO.content}"><br>
			writer : <input type="text" name="writer" value="${bbsDTO.writer}" readonly="readonly"><br>
			<button type="submit">수정</button>
		</form>
	</body>
</html>