<%@page import="javax.print.DocFlavor.STRING"%>
<%@page import="com.sun.xml.internal.bind.v2.runtime.Name"%>
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
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String[] hobby = request.getParameterValues("hobby");
			out.print("hobby list" + "<hr>");
			for(int i = 0; i < hobby.length; i++){
				out.print(hobby[i] + "<br>"); /* out.print -> 브라우저에서 출력  / 다 만들어져 있음*/
			}
		%>
		받아온 파라메터 값
		<hr>
		ID : <%= id %><br>
		PW : <%= pw %><br>
		NAME : <%= name %><br>
		TEL : <%= tel %><br>
		FOOd : ${param.food}<br>
		GENDER : ${param.gender}<br>
		
	</body>
</html>