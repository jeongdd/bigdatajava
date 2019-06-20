<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jquery2-5</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
		$(function(){	
			$("#form").submit(function(){
				var d = $(this).serialize();
				$.ajax({
					url:"member2.jsp",
					data: d,
					success: function(result){
						alert("ajax 통신성공");
						$("#result").text(result);
					}
				});
				return false;
			});
		});	
		</script>
	</head>
	<body>
		<div id="result"></div>
		<form action="" id="form">
			이름 : <input type="text" name="name" value="hong gil dong">
			<button type="submit" id="button">통신</button>
		</form>
	</body>
</html>