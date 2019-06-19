<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JQuery7</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$(":text").css("border", "2px dotted pink");
				$(":checked").attr("checked", false);
				$(":selected").attr("selected", false);
			});
		</script>
	</head>
	<body>
		<h1>탐색 선택자</h1>
		이름  <input type="text" value="홍길동"><br>
		아침을 먹었는지?
		<input type="checkbox" value="yes" checked="checked">예아 ㅇㅅㅇ
		<input type="checkbox" value="no">ㅇㅅㅇ 아뇨<br>
		먹은 음식 종류 무엇 ㅇㅅㅇ?
		<select>
			<option value="밥" >밥</option>
			<option value="빵" selected="selected">빵</option>
		</select>
		
	</body>
</html>