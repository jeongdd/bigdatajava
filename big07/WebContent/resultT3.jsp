<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ResultT3</title>
	</head>
	<body>
		<%
			String nation = request.getParameter("nation");
			String num = request.getParameter("num");
			int n1 = Integer.parseInt(num);
			if(n1 < 3){
				out.print(nation + "을 더 갈수도 있겠군요.");
			}else if(n1 >= 3){
				out.print(nation + "을 그만가셔야겠군요.");
			}
		%>
		
	</body>
</html>