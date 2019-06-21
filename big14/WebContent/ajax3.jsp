<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax-JSON</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
			$(function(){
				$.ajax({
					url:"json/rank.json",
					dataType:"json",
					success: function(result){
						alert("json문서 연결 성공");
						var list = result.rank;
						if(list.length > 0){
							$("#div").html("rank가 존재 확인 " + "<br>");
							$(list).each(function(index, member){
								var name = member.name;
								var tel = member.tel;
								$("#div").append(index + " - 이름 : " + name + " / 연락처 : " + tel + "<br>");
							})
						}
					}
				});
			});		
		</script>
</head>
<body>
	인기검색어 순위
	<hr color="red">
	<div id="div">
	</div>
</body>
</html>











