<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery6</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#b1").click(function(){
					$("h1").slideUp();
				});
				$("#b2").click(function(){
					$("h1").slideDown();
				});
				$("#b3").click(function(){
					$("h1").slideToggle();
				});
				$("#b4").click(function(){
					$("h1").toggle();
				});
				$("#b5").click(function(){
					$("h1").animate({marginLeft:"300px"},1000);
					$("h1").animate({marginLeft:0},1000);
				});
			});
		</script>
	</head>
	<body>
		<button id="b1">위ㅇㅅㅇ</button>
		<button id="b2">아래ㅁㅅㅁ</button>
		<button id="b3">토글토글ㅎㅅㅎ</button>
		<button id="b4">보였다안보였다ㅂㅅㅂ</button>
		<button id="b5">애니메이션 ㅇㅈㅇ</button>
		<h1>나는 내용이다.</h1>
	</body>
</html>