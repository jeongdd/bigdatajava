<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Member.JSP</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
			MemberDAO dao = new MemberDAO();
			dao.update(dto);
		%>
		회원정보 수정이 완료되었습니다.
		검색해보시겠습니까?<a href=find.jsp?id=<%= dto.getId() %>>수정 내용 확인해보기</a>
	</body>
</html>