<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>memberTest.jsp</title>
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String year = request.getParameter("year");
			String month[] = request.getParameterValues("month");
			String day = request.getParameter("day");
			String email = request.getParameter("email");
			String tel = request.getParameter("tel");
		%>
		<h1>등록한 정보</h1>
		<hr size="5" color="green">
		ID : <%= id %><br>
		PW : <%= pw %><br>
		NAME : <%= name %><br>
		BIRTH : <%= year %>년
		 <%for(int i = 0; i < month.length; i++){
			out.print(month[i]);
		 	}
		 %> 월
		<%= day %>일<br>
		GENDER : ${param.gender}<br>
		EMAIL : <%= email %><br>
		TEL : <%= tel %><br>
	</body>
</html>