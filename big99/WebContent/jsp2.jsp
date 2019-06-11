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
			if(id.equals("red")){
		%>
			<p>빨간색을 선택하셨군요.</p>
		<%
			}else if(id.equals("blue")){
		%>				
			<p>파란색을 선택하셨군요.</p>
		<%
			}else{
		%>
			<p>초록색을 선택하셨군요.</p>
		<%		
			}
		%>		
			</body>
</html>