<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정 완료</h1>
${bbsDTO.id}
${bbsDTO.title}
${bbsDTO.content}
${bbsDTO.writer}
<form action="update">
	<button type="submit">수정</button>
</form>
</body>
</html>