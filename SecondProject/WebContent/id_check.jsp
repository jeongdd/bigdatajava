<%@page import="music.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 중복확인</title>
</head>
<body>
	<jsp:useBean id="dto" class="music.MemberDTO"></jsp:useBean>
	<%
		MemberDAO dao = new MemberDAO();
		String str = "";
		String InputId = request.getParameter("id");
		String id = dao.idCheck(InputId);

		if (id == null) {
			str = "YES";
			out.write(str);
		} else {
			str = "NO";
			out.write(str);
		}
	%>

</body>
</html>