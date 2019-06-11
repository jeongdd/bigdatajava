<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>updateBbs.jsp</title>
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
			dao.update(dto);
		%>
		<div class="alert alert-primary" role="alert">
			회원정보 수정이 완료되었습니다.
		</div>
		검색해보시겠습니까?<a href=bbsFind.jsp?id=<%= dto.getId() %>>수정 내용 확인해보기</a>
	</body>
</html>