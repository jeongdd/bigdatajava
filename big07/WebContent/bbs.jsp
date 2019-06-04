<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bbs.jsp</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		
		<h1>DTO에 들어간 값 출력</h1>
		<hr color="salmon" size="5">
		ID : <%= dto.getId() %><br>
		TITLE : <%= dto.getTitle() %><br>
		CONTENT : <%= dto.getContent() %><br>
		WRITER : <%= dto.getWriter() %><br>
	</body>
</html>