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
				$("#b1").mouseover(function(){
					alert("내 위에 마우스가 있군요 ㅇㅅㅇ");
				});
				$("#b2").mouseout(function(){
					alert("저를 떠나시게여? ㅎㅅㅎ");
				});
				$("#data").keyup(function(){
					/* if($("#data").val().length < 5){ */
					var id = "root";
					if($("#data").val() == id){
						/* $("#result").text("아직 5글자 이상이 아닙니다."); */
						$("#result").text("id가 일치합니다.");
					}else{
						/* $("#result").text("무엇을 치고 있는지?" + 	$("#data").val()); */
						$("#result").text("id가 일치하지 않습니다.");
					}
				});
			});
		</script>
	</head>
	<body>
		<button type="button" id="b1">내 위로 ㄱㄱ</button>
		<button type="button" id="b2">나를 떠나요오오오오</button>
		<br>
		<input type="text" id="data">
		<div id="result"></div>
	</body>
</html>