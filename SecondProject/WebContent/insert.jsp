<%@page import="music.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="music.MemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		
		<%
			String y = request.getParameter("birthY");
			String m = request.getParameter("birthM");
			String d = request.getParameter("birthD");
			
			String birth = y + m + d;
			
			MemberDAO dao = new MemberDAO();
			dao.insert(dto);
		%>
		
		
	</body>
</html>