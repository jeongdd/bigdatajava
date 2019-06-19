<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery10</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#base").before("<li>내가 형</li>");
				$("#base").after("<li>내가 동생</li>");
				$("ul").prepend("<li>내가 첫째 형</li>");
				$("ul").append("<li>내가 막내동생</li>");
			});
		</script>
	</head>
	<body>
		<ul>
			<li id="base">----------기준 ㅇㅅㅇ----------</li>
		</ul>
	</body>
</html>