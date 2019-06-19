<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery11</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				/* $("li").css("background", "pink"); //자식이지워짐 */
				//$("li").empty(); //자식이지워짐 (텍스트만 삭제)
				//$("li").remove(); //자신이지워짐
				$("#b1").click(function(){
					$("li").addClass("aqua");  // = <li class="aqua">
				});
				$("#b2").click(function(){
					$("li").removeClass("aqua");  // = <li class="aqua">
				});
			});
		</script>
		<style type="text/css">
			.aqua{
				background: orange;
			}
		</style>
	</head>
	<body>
		<button type="button" id="b1">1누르시오 ㅇㅅㅇ</button>
		<button type="button" id="b2">2누르시오 ㅇㅅㅇ</button>
		<ul>
			<li >감자</li>
			<li>고구마</li>
			<li>옥수수</li>
		</ul>
	</body>
</html>