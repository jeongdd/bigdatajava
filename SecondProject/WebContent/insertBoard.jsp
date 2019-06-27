<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="music.BoardDTO"%>
<%@page import="music.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>insertBoard</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="music.BoardDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
			BoardDAO dao = new BoardDAO();
			dto = new BoardDTO();
			
			// 날짜
			Calendar cal = Calendar.getInstance();
			
			int year = cal.get(cal.YEAR);
			int month = cal.get(cal.MONTH);
			int day = cal.get(cal.DATE);
			String date=null;
			
			if(month < 10){
				date = Integer.toString(year) + "0"  + Integer.toString(month) + Integer.toString(day);
			}else if(month >= 10){
				date = Integer.toString(year) + Integer.toString(month) + Integer.toString(day);
			}
			
			// write.jsp에서 값 받아오기
			String title = request.getParameter("title");
			String id = request.getParameter("Input");
			String content = request.getParameter("content");
			
			// dto에 넣을 값 세팅
			dto.setTitle(title);
			dto.setId(id);
			dto.setContent(content);
			dto.setDate(date);
		
			
			dao.insert(dto);
		%>
	</body>
</html>