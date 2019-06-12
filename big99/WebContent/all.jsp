<%@page import="bean.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			// dao중에서 전체 리스트를 가지고 오는 
			// 메소드를 호출
			// 반복문으로 테이블 내에 tr태그내에 집어넣음
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberDTO> list = dao.selectAll();		
		%>
		<center>
			<table border="1" boardercolor="red" width="600">
				<tr align="center">
					<td>아 이 디</td>
					<td>패스워드</td>
					<td>이      름</td>
					<td>연 락 처</td>
				</tr>
				<% for(int i = 0; i < list.size() ; i++){ 
					MemberDTO dto = list.get(i);
				%>
					<tr align="center">
						<td><a href=find.jsp?id=<%= dto.getId() %>><%= dto.getId() %></a></td>
						<td><%= dto.getPw() %></td>
						<td><%= dto.getName() %></td>
						<td><%= dto.getTel() %></td>
					</tr>
					<% } %>
			</table>
		</center>
	</body>
</html>