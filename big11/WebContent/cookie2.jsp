<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cookie2</title>
	</head>
	<body>
		<%
			Cookie[] cookies = request.getCookies();
			for(Cookie c : cookies){
				String name = c.getName();
				out.write(name + "<br>");
				out.write("<hr>");
				if(name.equals("name")){
					String value = c.getValue();
					out.write(value + "<br>");
				}
			}
		%>
	</body>
</html>