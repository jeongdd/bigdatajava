<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- core  -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> <!-- format  -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
	<body>
		숫자 : <fmt:formatNumber value="123456789" type="number"></fmt:formatNumber><br>
		패턴 : <fmt:formatNumber value="1234.567889" pattern="0.000"></fmt:formatNumber><br>
		정수 : <fmt:parseNumber value="123.15456748" integerOnly="true"></fmt:parseNumber><br>
		<c:set var="date" value="<%= new Date() %>" />
		날짜만 길게 : <fmt:formatDate value="${date}" type="date" dateStyle="full"/><br>
		날짜만 짧게 : <fmt:formatDate value="${date}" type="date" dateStyle="short"/><br>
		시간만 : <fmt:formatDate value="${date}" type="time" dateStyle="full"/><br>
		날짜/시간 : <fmt:formatDate value="${date}" type="both" dateStyle="full"/><br>
	</body>
</html>