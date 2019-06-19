<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery9</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("button").click(function(){
					$("img").attr("width","500");
					$("img").attr("height","300");
					$("img").css("border","3px dashed pink");
					/* $("img").removeAttr("border"); */
				})
				
			});
		</script>
	</head>
	<body>
		<button>누르시오 ㅇㅅㅇ</button>
		<img src="hand.jpg">
	</body>
</html>