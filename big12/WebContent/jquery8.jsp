<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery8</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("button").click(function(){
					$("input").attr("checked", true);
				}); 
			});
		</script>
	</head>
	<body>
		<input type="checkbox" value="potato">감자<br>
		<input type="checkbox" value="sweetpotato">고구마<br>
		<input type="checkbox" value="onion">양파<br>
		<input type="checkbox" value="pumkin">호박<br>
		<button>전체선택 ㅇㅅㅇ</button>
	</body>
</html>