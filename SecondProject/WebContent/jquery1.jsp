<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery1</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				console.log("문서 loading ok...");
				// 태그 사이에 내용(content)을 가져오는 경우
				var h2 = $("h2").text(); // getText() / ()안에 값이들어가면 : setText();
				console.log(h2);
				$("h1").text(h2);
				$("h1,h2").css("background", "purple");
			});
		</script>
	</head>
	<body>
		<h2>안녕하세요!</h2>
		<h1></h1>
	</body>
</html>