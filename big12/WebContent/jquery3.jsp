<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery3</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				var pText = $("p").text();
				alert("6월 19일은 " + pText);
				var result = confirm("정말로 수요일 인가요?");
				console.log(result);
				if(result == true){
					$("h1").text("정말 수요일이네여 ㅇㅅㅇ");
				}else{
					var input = prompt("그럼 무슨요일이죠ㅇㅅㅇ?");
					$("h2").text("오늘은 " + input + "요일 이었군.ㅇㅅㅇ..");
				}
			});
		</script>
	</head>
	<body>
		<p>오늘은 수요일 입니다.</p>
		<h1>나는 제목</h1>
		<h2>나도 작은 제목</h2>
		
	</body>
</html>