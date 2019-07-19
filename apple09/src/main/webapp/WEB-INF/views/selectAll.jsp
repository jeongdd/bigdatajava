<%@page import="com.itbank.mvc09.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- 스프링은 자동으로 들어가있음 --> --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>검색 리스트</h1>
		<%
			List<MemberDTO> list = (List<MemberDTO>)request.getAttribute("list");
			for(int i = 0; i < list.size(); i++){
				MemberDTO dto = list.get(i);
		%>
			<hr color="skyblue" size="5">
			아이디 : <%= dto.getId() %><br>
			패스워드 :<%= dto.getPw() %><br>
			이름 : <%= dto.getName()%><br>
			나이 : <%= dto.getAge() %><br>
			
		<% } %>
			
		
	</body>
</html>