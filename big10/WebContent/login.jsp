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
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String dbId = "root";
			String dbPw = "1234";
			
			if((id.equals(dbId))&&(pw.equals(dbPw))){
				session.setAttribute("id", id);
				// setAttribute할 때,
				// session속성의 이름은 String 타입
				// session속성의 값은 Object타입
				// 값은 아무 타입이나 가능(upcasting, 자동형변환)
			}else{
				response.sendRedirect("el4.jsp");
			}
		%>
		${id}<br>
		
		<%= session.getAttribute("id") %> <!-- 정석문법  -->
		
	</body>
</html>