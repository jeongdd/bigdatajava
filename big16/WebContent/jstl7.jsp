<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- core  -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> <!-- format  -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> <!-- sql  -->

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
		<%-- <sql:update dataSource="${db}">
			insert into member values(?,?,?,?)
			<sql:param value="final"></sql:param>
			<sql:param value="final"></sql:param>
			<sql:param value="final"></sql:param>
			<sql:param value="final"></sql:param>
		</sql:update> --%>
		
		<sql:query var="list" dataSource="${db}">
	   		select*from member
	   	</sql:query>
	   
	   	<c:forEach var="imsi" items="${list.rows}">
	  	 	${imsi}<br>
	   	</c:forEach>
	</body>
</html>