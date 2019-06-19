<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery5</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				count = 0;
				$("button").click(function(){
					count++;
					$("h1").text(count + "회");
				});
			});
		</script>
	</head>
	<body>
		<button>누르셈ㅇㅅㅇ</button>
		<h1></h1>		
	</body>
</html>