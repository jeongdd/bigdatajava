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
		<c:set var="str" value="jspStudy :: the whole new world!!"></c:set>
		<hr color="yellow">
		
		길이 : ${fn:length(str)}<br>
		글자추출 : ${fn:substring(str,0,8)}<br>
		글자이후추출 : ${fn:substringAfter(str,"::")}<br>
		글자이전추출 : ${fn:substringAfter(str,"he")}<br>
		글자대문자로 : ${fn:toUpperCase(str)}<br>
		글자소문자로 : ${fn:toLowerCase(str)}<br>
		글자대체변환 : ${fn:replace(str,"He","She")}<br>
		글자 : ${fn:indexOf(str,"::")}<br>
		글자 : ${fn:contains(str,"::")}<br>
		
	</body>
</html>