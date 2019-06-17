<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member.jsp</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean> <!-- 객체생성/import =>역할 -->
		<jsp:setProperty property="*" name="dto"/> <!-- 멤버변수에 대한 속성들을 다 호출  -->
		
		<jsp:getProperty property="id" name="dto"/>
		<br>
		${dto.id}  <!-- 변수로 직접 접근하는것이 x get메소드로 접근 -->
		<br>
		<%= dto.getId() %>
		
		<%
			String sId = (String)session.getAttribute("id"); /* downcasting을 해줘야함 */
		%>
	</body>
</html>