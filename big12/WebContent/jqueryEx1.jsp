<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQueryEx1</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				count = 0;
				$("button").click(function(){
					var text = $("input#jInput").val();
					count++;
					$("p").after("댓글" + count + ": " + text + "<br>");
				});
			});
		</script>
	</head>
	<body>
		<h1>내용을 입력하시오.</h1>
		<input type="text" id="jInput">
		<button>등록</button>
		<hr color="red" size="5">
		<p>!!!!!!!내가 기준 ㅇㅅㅇ!!!!!!!</p>
		<h3></h3>
		
		
	</body>
</html>