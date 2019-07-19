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
	<%
		List<BbsDTO> list = (List<BbsDTO>)request.getAttribute("list");
		for(int i = 0; i < list.size(); i++){
			BbsDTO dto = list.get(i);
	%>
	<hr>
	아이디 : <a href="select?id=<%= dto.getId() %>"><%= dto.getId() %></a><br>
	제목 : <%= dto.getTitle() %><br>
	내용 : <%= dto.getContent() %>	<br> 
	글쓴이 : <%= dto.getWriter()%> <br>
	
	<% } %>
</body>
</html>