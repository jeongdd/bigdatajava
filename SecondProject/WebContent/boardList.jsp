<%@page import="java.util.ArrayList"%>
<%@page import="music.BoardDTO"%>
<%@page import="music.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
			crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
			integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" 
			crossorigin="anonymous"></script>
	</head>
	<body>
		<%
			BoardDAO dao = new BoardDAO();
			ArrayList<BoardDTO> list = dao.selectAll();
		%>
			<center>
				<table border="1" boardercolor="#dddddd" width="800">
					<tr align="center">
						<td width="80">N u m</td>
						<td width="200">제     목</td>
						<td width="100">아 이 디</td>
					</tr>
					<% for(int i = 0; i < list.size(); i++){
						BoardDTO dto = list.get(i);
					%>
					<tr align="center">
						<td><%= dto.getNum()%></td>
						<td><a href=""><%= dto.getTitle() %></a></td>
						<td><%= dto.getId() %></td>
					</tr>
					<% } %>
				</table>
			</center>
	
	
		<form action="write.jsp">
			<button type="submit" class="btn btn-secondary">글 쓰기</button>
		</form>
	</body>
</html>