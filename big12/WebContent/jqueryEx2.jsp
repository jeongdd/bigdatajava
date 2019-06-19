<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQueryEx2</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("button").click(function(){
					$("body").after("<img src='hand.jpg'>");
				})
			});
		</script>
	</head>
	<body>
		<button>이미지추가</button><br>
		<img src="hand.jpg" border="1">
	</body>
</html>