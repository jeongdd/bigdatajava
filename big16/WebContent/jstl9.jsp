<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- core  -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> <!-- format  -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> <!-- sql  -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> <!-- function  / 문자열 관련-->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
	<body>
		<sql:setDataSource 
		   url="jdbc:mysql://127.0.0.1:3306/bigdata"
		   driver="com.mysql.jdbc.Driver"
		   user="root"
		   password="1234"
		   scope="application"
		   var ="db"
		 />
		
		<sql:query var="list" dataSource="${db}">
	   		select*from bbs
	   	</sql:query>
	   
	   	<table border="1">
	  	 	<c:forEach var="imsi" items="${list.rows}">
	  	 		<tr>
	  	 			<td>${imsi}</td>
	  	 		</tr>
		   	</c:forEach>
	 	</table>
	</body>
</html>