<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQueryEx3</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			
		$(function(){
			$("#fd1").change(function(){
				$(".fd2").attr("checked", true);
			})
			$("#pc1").change(function(){
				$(".pc2").attr("checked", true);
			})
		});
		</script>
	</head>
	<body>
		<input type="checkbox" id="fd1">음식
		<ul type="none">
			<li><input type="checkbox" class="fd2">감자</li>
			<li><input type="checkbox" class="fd2">고구마</li>
		</ul>
		<input type="checkbox" id="pc1">장소
		<ul type="none">
			<li><input type="checkbox" class="pc2">공원</li>
			<li><input type="checkbox" class="pc2">학원</li>
		</ul>
	</body>
</html>