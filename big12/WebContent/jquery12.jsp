<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery12</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#btn").click(function() {
					console.log("눌렀군여 ㅇㅅㅇ..");
					return false;
				});
			});
		</script>
	</head>
	<body>
		<a href="https://www.google.com/" id="btn">누울러어라아 ㅇㅠㅇ</a>
	</body>
</html>