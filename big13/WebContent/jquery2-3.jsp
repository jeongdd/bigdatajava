<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jquery2-1</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				var food = ["감자","고구마","옥수수"];
				for(var i = 0; i < food.length; i++){
					console.log(food[i]);
				}
				var food2 = [];
				for(var i = 0; i < 3; i++){
					food2[i] = prompt("먹고싶은 음식을 입력하세요.");
				}
				for(var i = 0; i < food2.length; i++){
					console.log(food2[i]);
				}
			});
			
		</script>
	</head>
	<body>
		
	</body>
</html>