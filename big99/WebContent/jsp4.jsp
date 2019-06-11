<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		요청방식 : <%= request.getScheme()	%><br>
		서버이름 : <%= request.getServerName() %><br>
		서버주소 : <%= request.getLocalAddr() %><br>
		서버포트 : <%= request.getServerPort() %><br>
		클라이언트 포트 : <%= request.getRemotePort() %>&nbsp;(임의로 발생)<br>
		클라이언트 주소 : <%= request.getRemoteHost() %><br>
		클라이언트 주소 : <%= request.getRemoteAddr() %><br>
		<hr>
		<h1>중요함(외우기)</h1>
		<h3>
		클라이언트 문서정보 : <%= request.getRequestURI() %>&nbsp; - 어느 페이지를 요청했는지<br>
		클라이언트 문서정보 풀네임 : <%= request.getRequestURL() %><br>
		프로젝트의 이름 : <%= request.getContextPath() %><br>
		</h3>
	</body>
</html>