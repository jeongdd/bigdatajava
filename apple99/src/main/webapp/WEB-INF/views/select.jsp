<%@page import="java.util.List"%>
<%@page import="com.itbank.mvc99.ReplyDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script>
		$(function(){
			$("#reply").click()
			$.ajax({
				type:GET,
				url: 'insert.jsp',
				
			});
		});
		</script>
	</head>
	<body>
	<h1>ID 검색결과 입니다.</h1>
	<hr>
	아이디 : ${dto.id }<br>
	제목 : ${dto.title }<br>
	내용 : ${dto.content }<br>
	글쓴이 : ${dto.writer }<br>
	<hr style="color: pink; size: 5px;">
	<form action="insertR">
		<input type="hidden" name="id" value="${dto.id}" >
		댓글  : <input type="text" name="reply">
		<button type="submit" id="reply">댓글 등록</button>
	</form>
	<hr style="color: pink; size: 5px;">
	<div id="all"></div>
	</body>
</html>