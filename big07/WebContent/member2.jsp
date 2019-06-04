<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member2.jsp</title>
	</head>
	<body>
		<!-- import bean.MemberDTO; -->
		<!-- MemberDTO dto = new MemberDTO(); -->
		<!-- ↑ 같은 것 -->
		<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean> <!-- action태그 -->
		<jsp:setProperty property="*" name="dto"/>  <!-- name은 위에 id와 같아야함 -->
		<!-- ↑ dto.sestId(requesst.gerParameter("id");~~~ 를 다 처리해줌 -->
		<%
		
		%>
		DTO에 들어간 값 출력
		<hr color="green">
		id : <%= dto.getId() %><br>
		pw : <%= dto.getPw() %><br>
		name : <%= dto.getName() %><br>
		tel : <%= dto.getTel() %><br>
	</body>
</html>