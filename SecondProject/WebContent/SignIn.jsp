<%@page import="music.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="music.MemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		
		<%
			MemberDAO dao = new MemberDAO();
			dao.insert(dto);
		%>
		<center>
			<h1>회원등록 정보입니다.</h1>
			<hr color="pink" size="5">
			<table border="1">
				<tr>
					<td>ID</td>
					<td><%= dto.getId() %></td>
				</tr>
				<tr>
					<td>PW</td>
					<td><%= dto.getPw() %></td>
				</tr>
				<tr>
					<td>NAME</td>
					<td><%= dto.getName() %></td>
				</tr>
				<tr>
					<td>GENDER</td>
					<td><%= dto.getGender() %></td>
				</tr>
				<tr>
					<td>BIRTH</td>
					<td><%= dto.getBirth() %></td>
				</tr>
				<tr>
					<td>EAMIL</td>
					<td><%= dto.getEmail() %></td>
				</tr>
						
			</table>
		</center>
		
	</body>
</html>