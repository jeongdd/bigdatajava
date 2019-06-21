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
					url:"xml/dataset2.xml",
					dataType:"xml",
					success: function(result){
						alert("xml문서 연결 성공");
						if($(result).find("record").length > 0){
							$(result).find("record").each(function(){
								var first_name = $(this).find("first_name").text();
								var last_name = $(this).find("last_name").text();
								$.ajax({
									url:"xmldb.jsp",
									data:{
										"first_name" : first_name,
										"last_name" : last_name
									},
									success: function(){
										console.log("okkkk");
									}
								});
							});
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











