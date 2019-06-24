<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>API</title>
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#b1").click(function(){
					$.ajax({
						url: "https://api.rss2json.com/v1/api.json?rss_url=http://www.chosun.com/site/data/rss/rss.xml&api_key=vne7a9ggrkwmdj27u2gw9tikspqy9smvmjegd4m2",
						dataType:"json",
						data:{
							url:"http://www.chosun.com/site/data/rss/rss.xml",
							api_key:"vne7a9ggrkwmdj27u2gw9tikspqy9smvmjegd4m2",
							count: 20
						},
						success: function(result){
							$("#result").empty();
							for (let index = 0; index < 20; index++) {
								var title = result.items[index].title;
								var img = result.items[index].thumbnail;
								var link = result.items[index].link;
								$("#result").append("- <a href=" + link + ">" + title + "</a><br>")
								$("#result").append("- <img src=" + img + "><br>")
							}
						}
					});
				});
				$("#b2").click(function(){
					$.ajax({
						url:"https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fpolitics.xml&api_key=vne7a9ggrkwmdj27u2gw9tikspqy9smvmjegd4m2",
						dataType: "json",
						data:{
							url:"http://www.chosun.com/site/data/rss/politics.xml",
							api_key: "vne7a9ggrkwmdj27u2gw9tikspqy9smvmjegd4m2",
							count: 20
						},
						success: function(result){
							$("#result").empty();
							for (let index = 0; index < 20; index++) {
								var title = result.items[index].title;
								var img = result.items[index].thumbnail;
								var link = result.items[index].link;
								$("#result").append("- <a href=" + link + ">" + title + "</a><br>")
								$("#result").append("- <img src=" + img + "><br>")
								
							}
						}
					})
				});
				$("#b3").click(function(){
					$.ajax({
						url:"https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Finternational.xml&api_key=vne7a9ggrkwmdj27u2gw9tikspqy9smvmjegd4m2",
						dataType: "json",
						data:{
							url:"http://www.chosun.com/site/data/rss/international.xml",
							api_key: "vne7a9ggrkwmdj27u2gw9tikspqy9smvmjegd4m2",
							count: 20
						},
						success: function(result){
							$("#result").empty();
							for (let index = 0; index < 20; index++) {
								var title = result.items[index].title;
								var img = result.items[index].thumbnail;
								var link = result.items[index].link;
								$("#result").append("- <a href=" + link + ">" + title + "</a><br>")
								$("#result").append("- <img src=" + img + "><br>")
								
							}
						}
					})
				});
			});		
		</script>
	</head>
	<body>
		<button id="b1" type="button">속보</button>
		<button id="b2" type="button">정치</button>
		<button id="b3" type="button">국제</button>
		<div id="result"></div>
	</body>
</html>