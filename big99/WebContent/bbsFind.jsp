<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bbsFind.jsp</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
			integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
			BbsDAO dao = new BbsDAO();
			BbsDTO dto2 = dao.select(dto);
		%>
		
		<h1><b>검색결과 입니다.</b></h1>
		<hr>
		<form action="updateBbs.jsp">
			id : <input type="text" name="id" value="<%= dto2.getId() %>" readonly="readonly"><br>
			title : <input type="text" name="title" value="<%= dto2.getTitle() %>"><br>
			content : <input type="text" name="content" value="<%= dto2.getContent() %>"><br>
			etc : <input type="text" name="etc" value="<%= dto2.getEtc() %>"><br>
			<button type="submit" class="btn btn-primary">수정</button>
		</form>
		<br>
		<form action="deleteBbs.html">
			<button type="submit" class="btn btn-dark" >삭제</button>
		</form>
	</body>
</html>