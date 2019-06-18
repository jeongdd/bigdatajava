<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request1</title>
		
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.BasketDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
				
		<%
			ArrayList<BasketDTO> list = (ArrayList<BasketDTO>)session.getAttribute("basket");
		%>
		장바구니에 들어간 물건의 개수 : <%= list.size() %><br>
		<%
			for(int i = 0; i < list.size(); i++){
		%>
		제품 id : <%= dto.getpId() %>,
		제품 수량 : <%=dto.getCount() %>,
		제품 가격 : <%= dto.getPrice() %><br>
		<%} %>
	</body>
</html>