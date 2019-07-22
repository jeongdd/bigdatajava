<%@page import="com.itbank.mvc99.ReplyDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.itbank.mvc99.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: pink">게시글 목록</h1>
	<%
		List<BbsDTO> list11 = (List<BbsDTO>)request.getAttribute("list11");
		for(int i = 0; i < list11.size(); i++){
			BbsDTO dto = list11.get(i);
	%>
	<hr>
	아이디 : <a href="select?id=<%= dto.getId() %>"><%= dto.getId() %></a><br>
	제목 : <%= dto.getTitle() %><br>
	내용 : <%= dto.getContent() %>	<br> 
	글쓴이 : <%= dto.getWriter()%> <br>
	
	<% } %>
	
	<hr color="yellowgreen" size="5">
		<h2 style="color: skyblue">댓글 전체리스트</h2>
		<%
			List<ReplyDTO> list2 = (List<ReplyDTO>)request.getAttribute("list2");
			for(int i = 0; i < list2.size(); i++){
				ReplyDTO dto = list2.get(i);
		%>
		<img src="resources/img/jyp2.jpeg" style="width: 50px; height: 60px;">
			아이디  : <%= dto.getId() %><br>
			댓글 : <%= dto.getReply() %><br>
			<hr color="skyblue" size="5">
		
		<%
			}
		%>
		
	
	
</body>
</html>